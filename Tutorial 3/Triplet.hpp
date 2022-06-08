#ifndef _TRIPLET_HPP_
#define _TRIPLET_HPP_

#include <iostream>

template <class f, class s, class t>
class Triplet {
private:
    f first;
    s second;
    t third;
public:
    Triplet() {}
    Triplet(f first, s second, t third) {
        this->first = first;
        this->second = second;
        this->third = third;
    }
    Triplet(const Triplet& tr) {
        this->first = first;
        this->second = second;
        this->third = third;
    }

    f getFirst() {
        return this->first;
    }
    s getSecond() {
        return this->second;
    }
    t getThird() {
        return this->third;
    }

    void setFirst(f first) {
        this->first = first;
    }
    void setSecond(s second) {
        this->second = second;
    }
    void setThird(t third) {
        this->third = third;
    }

    bool operator==(const Triplet& tr) {
        return (this->first == tr.first) && (this->second == tr.second) && (this->third == tr.third);
    }

    bool operator!=(const Triplet& tr) {
        return (this->first != tr.first) || (this->second != tr.second) || (this->third != tr.third);
    }
};

#endif
