#ifndef _Vector_HPP_
#define _Vector_HPP_

#include <iostream>

using namespace std;

template <class T, int n>
class Vector {
private:
    T* elements;

public:
    Vector() {
        this->elements = new T[n];
        for (int i=0; i<n; i++)
        {
            this->elements[i] = 0;
        }
    }

    Vector(const Vector& other) {
        this->elements = new T[n];
        for (int i=0; i<n; i++)
        {
            this->elements[i] = 0;
        }
    }

    ~Vector() {
        delete[] this->elements;
    }

    T& operator[](int idx) {
        return this->elements[idx];
    }

    Vector operator+(const Vector& other) {
        Vector result;
        for (int i=0; i<n; i++)
        {
            result.elements[i] = elements[i] + other.elements[i];
        }
        return result;
    }

    Vector operator-(const Vector& other) {
        Vector result;
        for (int i=0; i<n; i++)
        {
            result.elements[i] = elements[i] - other.elements[i];
        }
        return result;
    }

    bool operator<(const Vector& other) {
        for (int i=0; i<n; i++)
        {
            if (elements[i] != other.elements[i])
                return elements[i] < other.elements[i];
        }
    }

    bool operator>(const Vector& other) {
        for (int i=0; i<n; i++)
        {
            if (elements[i] != other.elements[i])
                return elements[i] > other.elements[i];
        }
    }

    friend std::ostream& operator<<(ostream& os, Vector vector) {
        os << "<";
        os << vector.elements[0];
        os << ",";
        os << vector.elements[1];
        os << ">";
        return os;
    }

    friend std::istream& operator>>(istream& is, Vector& vector) {
        return is >> vector.elements[0] >> vector.elements[1];
    }
};

#endif
