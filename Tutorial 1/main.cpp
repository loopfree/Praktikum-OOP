// Steven
// 13520131

// Menggunakan kelas A untuk menghasilkan keluaran berikut:

// new empty box 2
// new empty box with default id 0
// new empty box 1
// assign box 0 <- 2
// copy box 1
// box 2
// box 1
// destroy box 2
// destroy box 1
// destroy box 1
// destroy box 2

#include "Box.hpp"
#include <iostream>

int main() {
    // Box a{2};
    // Box b;
    // Box c{1};
    // b = a;
    // Box d{c};
    // a.peek();
    // c.peek();

    Box* a = new Box{2};
    Box* b = new Box;
    Box* c = new Box{1};

    *b = *a;

    Box* d = new Box{*c};

    a->peek();
    c->peek();

    delete a;
    delete c;
    delete d;
    delete b;
}
