import java.util.*;

public class Dompet<T extends Number> {
    private ArrayList<Transaction<T>> transactions;


    public Dompet() {
        // Constructor tanpa parameter, transactions diinisialisasi 
        // dengan array list baru
        transactions = new ArrayList<Transaction<T>>();
    }


    public Dompet(T initialBalance) {
        // Constructor dengan parameter T initialBalance, inisialisasi 
        // transactions dengan array list baru dan tambahkan transaksi 
        // tambah dengan value initial balance
        /* contoh transaksi tambah: new Transaction<T>('+', initialBalance) */

        transactions = new ArrayList<Transaction<T>>();
        transactions.add(new Transaction<T>('+', initialBalance));
    }

    public void addMoney(T money) {
        // Buat prosedur addMoney dengan parameter T money, tambahkan 
        // transaksi tambah dengan senilai money

        transactions.add(new Transaction<T>('+', money));
    }

    public boolean takeMoney(T money) {
        // Tambahkan transaksi kurang sebesar money (perlu ada pengecekan 
        // apakah balance cukup atau tidak)
        // false bila transaksi gagal, true bila berhasil

        if(getBalance() < (double) money.doubleValue()) {
            return false;
        }
        transactions.add(new Transaction<T>('-', money));
        return true;
    }

    public void setBalance(T balance) {
        // Mengganti transaksi agar bernilai sama dengan balance
        // Tips: inisialisasi ulang transactions, lalu tambahkan transaksi 
        // tambah sebanyak balance
        transactions = new ArrayList<Transaction<T>>();
        transactions.add(new Transaction<T>('+', balance));
    }

    // Akses nilai Double dilakukan dengan .doubleValue()
    // Contoh: amount.doubleValue()

    public Double getBalance(){
        // Mencari balance dompet dari transaksi dengan cara menghitung 
        // total transaksi

        double result = 0;
        for(Transaction<T> trans : transactions) {
            if(trans.getType() == '+') {
                result += (double) trans.getAmount().doubleValue();
            } else {
                result -= (double) trans.getAmount().doubleValue();
            }
        }

        return result;
    }

    public void printTransactions() {
        // Print seluruh transaksi yang ada pada array
        // Format: Transactions [indeks + 1]: [tipe transaksi] [amount]
        // Contoh: Transactions 3: + 500

        for(int i = 0; i < transactions.size(); ++i) {
            Transaction<T> temp = transactions.get(i);

            System.out.print("Transactions ");
            System.out.print(i + 1);
            System.out.print(": ");
            System.out.print(temp.getType());
            System.out.print(" ");
            System.out.println(temp.getAmount().intValue());
        }
    }

    public Double getAverageTransaction() {
        // Mencari rata-rata transaksi (jika tidak ada transaksi, 
        // berikan hasil null)

        if (transactions.size()==0) {
            return null;
        }
        else {
            // double sum = 0;
            // for(Transaction<T> trans : transactions) {
            //     sum += trans.getAmount().doubleValue();
            // }
            // sum /= transactions.size();
            // return sum;
            return getBalance() / transactions.size();
        }
    }

    public Double getMinimumTransaction() {
        // Mencari nilai minimum transaksi (jika tidak ada transaksi, 
        // berikan hasil null;hanya perlu membandingkan nilainya saja 
        // tanpa peduli type)

        if (transactions.size() == 0) {
            return null;
        }
        double min = -1;
        for(Transaction<T> trans : transactions) {
            double temp = (double) trans.getAmount().doubleValue();
            if(min == -1) {
                min = temp;
            } else if(min > temp) {
                min = temp;
            }
        }
        return min;
    }

    public Double getMaximumTransaction() {
        // Mencari nilai maksimum transaksi (jika tidak ada transaksi, 
        // berikan hasil null; hanya perlu membandingkan nilainya saja 
        // tanpa peduli type)

        if (transactions.size()==0) {
            return null;
        }
        double max = -1;
        for(Transaction<T> trans : transactions) {
            double temp = (double) trans.getAmount().doubleValue();
            if(max == -1) {
                max = temp;
            } else if(max < temp) {
                max = temp;
            }
        }
        return max;
    }
}