// Steven
// 13520131

#include "Item.hpp"
#include <iostream>

using namespace std;

int Item::totalRevenue = 0;		// Total penghasilan dari penjualan semua item
int Item::totalItems = 0;			// Jumlah item yang telah didaftarkan

Item::Item() : serialNum(totalItems+1)
{
    this->stock = 0;
    this->price = 0;
    this->sold = 0;
    totalItems += 1;
}

Item::Item(int stock, int price) : serialNum(totalItems+1)
{
    this->stock = stock;
    this->price = price;
    this->sold = 0;
    totalItems += 1;
}

Item::Item(const Item& x) : serialNum(totalItems+1)
{
    this->stock = x.stock;
    this->price = x.price;
    this->sold = x.sold;
    totalItems += 1;
}

Item::~Item()
{
    // Destruct
}

int Item::getSerialNum() const
{
    return serialNum;
}

int Item::getSold() const
{
    return sold;
}

int Item::getPrice() const
{
    return price;
}

void Item::addStock(int addedStock)
{
    this->stock += addedStock;
}

void Item::sell(int soldStock)
{
    if (soldStock <= this->stock)
    {
        this->stock -= soldStock;
        totalRevenue += soldStock*this->price;
        this->sold += soldStock;
    }

    //if (soldStock > this->stock)
    else
    {
        totalRevenue += this->stock * this->price;
        this->sold += this->stock;
        this->stock = 0;
    }
}

void Item::setPrice(int newPrice)
{
    this->price = newPrice;
}
