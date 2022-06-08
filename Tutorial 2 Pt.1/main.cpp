// Steven
// 13520131
// main.cpp

#include "Bike.h"
#include "Car.h"

int main(){
    // ctor part
    Car *c4 = new Car (4);
    Vehicle *c10 = new Car (10);
    Bike *b1 = new Bike;

    // cctor part
    Vehicle *b2 = new Vehicle(*b1);

    // middle dtor part
    b1->~Bike();

    // multiple void part
    c10->drive();
    b2->clean();
    c4->drive();
    b2->park();

    // last dtor part
    c10->~Vehicle();
    b2->~Vehicle();
    c4->~Car();

    return 0;
}
