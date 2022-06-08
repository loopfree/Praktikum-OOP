// Steven
// 13520131
// Bottle.cpp

#include "Bottle.hpp"

#include <iostream>
using namespace std;

int Bottle::numOfBottle=0;

Bottle::Bottle() : id(numOfBottle+1)
{
    this->height = 10.00;
    this->radius = 10.00;
    this->waterHeight = 0.00;
    numOfBottle += 1;
}

Bottle::Bottle(float height, float radius) : id(numOfBottle+1)
{
    this->height = height;
    this->radius = radius;
    this->waterHeight = 0.00;
    numOfBottle += 1;
}

Bottle::Bottle(const Bottle& bottle) : id(bottle.id)
{
    height = bottle.height;
    radius = bottle.radius;
    waterHeight = bottle.waterHeight;
}

Bottle::~Bottle()
{
    //Destruct
}

int Bottle::getId() const
{
    return id;
}

float Bottle::getWaterVolume() const
{
    return PI * radius *radius * waterHeight;
}

float Bottle::getBottleVolume() const
{
    return PI *radius *radius * height;
}

void Bottle::setHeight(float height)
{
    if (this->waterHeight > height)
    {
        this->waterHeight = height;
        this->height = height;
    }
    else
    {
        this->height = height;
    }
}

void Bottle::addWater(float waterVolume)
{
    float add = waterVolume / (PI * radius * radius);
	waterHeight += add;
	if (waterHeight > height)
    {
		waterHeight = height;
	}
}

void Bottle::substractWater(float waterVolume)
{
    float sub = waterVolume / (PI * radius * radius);
	waterHeight -= sub;
	if (waterHeight < height)
    {
		waterHeight = 0.00;
	}
}

float Bottle::getWaterHeightIfVolume(float waterVolume) const
{
    return waterVolume/(PI * radius * radius);
}

void Bottle::pourWaterTo(Bottle& other)
{
    float delta = other.getBottleVolume() - other.getWaterVolume();
    float gain = getWaterVolume();

    other.addWater(gain);
    if (gain > delta)
    {
        substractWater(delta);
    }
    else
    {
        waterHeight = 0.00;
    }
}
