// Steven
// 13520131
// BunchOfKeys.cpp

#include "BunchOfKeys.hpp"

#define nl "\n"

BunchOfKeys::BunchOfKeys()
{
    this->n_keys = 0;
}

void BunchOfKeys::add()
{
    this->n_keys += 1;
}

void BunchOfKeys::shake()
{
    if (this->n_keys <= 1)
    {
        cout << "Tidak terjadi apa-apa" << nl;
    }
    else
    {
        for (int i=0; i< this->n_keys; i++)
        {
            cout << "krincing" << nl;
        }
    }
}
