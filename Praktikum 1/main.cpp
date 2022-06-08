// Steven
// 13520131

#include "Wallet.hpp"
#include <iostream>
using namespace std;

int main()
{
    Wallet* a = new Wallet; // nol
    Wallet* b = new Wallet(1, 10000); // satu
    b->checkBalance();
    Wallet* c = new Wallet(2,8000); // dua

    *c = *b;

    b->addBalance(5000);
    a->addBalance(3000);

    a->checkBalance();
    c->checkBalance();
    b->checkBalance();

    delete b;
    delete a;
    delete c;
}
