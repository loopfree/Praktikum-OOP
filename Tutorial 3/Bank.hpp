#ifndef __BANK_HPP__
#define __BANK_HPP__

#include <iostream>
#include <string>
#include <cstring>

#include "Account.hpp"

#include "BaseException.hpp"

// Definisikan TransactionFailedException di sini
// TransactionFailedException merupakan anak dari kelas BaseException, memiliki:
// - exc bertipe BaseException*
// - constructor menerima argumen exc
// - printMessage yang menuliskan "Transaksi gagal dengan pesan kesalahan:\n"
//   diikuti dengan pemanggilan exc->printMessage()

class TransactionFailedException : public std::exception
{
    private:
        BaseException *exc;
    public:
        TransactionFailedException(BaseException *exc)
        {
            this->exc = exc;
            cout << "Transaksi gagal dengan pesan kesalahan:\n";
            exc->printMessage();
        }
};

// Definisikan AccountNotFoundException di sini
// AccountNotFoundException merupakan anak dari kelas BaseException, memiliki:
// - number bertipe string
// - constructor menerima argumen number
// - printMessage yang menuliskan "Tidak ditemukan rekening dengan nomor {number}\n"

class AccountNotFoundException : public std::exception
{
    private:
        string number;
    public:
        AccountNotFoundException(string number)
        {
            this->number = number;
            cout << "Tidak ditemukan rekening dengan nomor " << number << "\n";
        }
};

class Bank {
private:
    Account* accounts;
    static const int maxEl = 100;

public:
    Bank() {
        this->accounts = new Account[Bank::maxEl];
    }

    ~Bank() {
        delete[] this->accounts;
    }

    Account& getAccount(int idx) {
        return this->accounts[idx];
    }

    int findAccountIdx(string number) {
        // Mengembalikan indeks rekening yang memiliki nomor number
        int idx = -1;
        for (int i = 0; i < Bank::maxEl; i++) {
            //cout << this->accounts[i].getNumber() << "\n";
            if (this->accounts[i].getNumber() == number) {
                idx = i;
            }
        }

        if (idx == -1)
        {
            // TODO: Melempar AccountNotFoundException* bila tidak ditemukan
            //       rekening dengan nomor number
            throw "AccountNotFoundException";
        }
        else
        {
            return idx;
        }

    }

    void transfer(string fromNumber, string toNumber, int amount) {
        Account tempFrom;
        Account tempTo;
        try
        {
            Account& fromAccount = this->accounts[this->findAccountIdx(fromNumber)];
            Account& toAccount = this->accounts[this->findAccountIdx(toNumber)];

            tempFrom = fromAccount;
            tempTo = toAccount;
            // Mengirimkan uang sebanyak amount dari account dengan nomor
            // fromNumber ke account dengan nomor toNumber

            // TODO: Menambah balance dari account tujuan dengan method add
            //       dan mengurangi balance dari account asal dengan method withdraw.
            toAccount.add(amount);
            fromAccount.withdraw(amount);
        }
        catch (const char* e)
        {
            string x(e);

            if (x=="AccountNotFoundException")
            {

            }
            else if (x=="InvalidNumberException")
            {
                Account& fromAccount = this->accounts[this->findAccountIdx(fromNumber)];
                Account& toAccount = this->accounts[this->findAccountIdx(toNumber)];
                fromAccount = tempFrom;
                toAccount = tempTo;
            }

            //cout << x;
            // TODO: Menangkap semua jenis Exception yang dilempar dan melempar TransactionFailedException*.
            //       Hint: jangan menangkap tiap jenis exception, manfaatkan BaseException.
            //       Jika transaksi gagal, PASTIKAN balance kedua rekening tidak ada yang
            //       berubah.

        }
    }
};

#endif
