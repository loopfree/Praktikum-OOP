// Steven
// 13520131
// Weed.cpp

#include "Weed.hpp"

using namespace std;

Weed::Weed()
{
    this->many = 1;
}

Weed::Weed(int n)
{
    this->many = n;
}

Weed::Weed(const Weed &b)
{
    this->many = b.many;
}

Weed::~Weed()
{
    // Destruct
}

void Weed::step()
{
    if(many > 0)
    {
        int check = 1000;
        if (many > check)
        {
            many = check;
        }
        for (int i=0; i<many; i++)
        {
            cout << "kresek...";
        }
    }

    cout << endl;
}
