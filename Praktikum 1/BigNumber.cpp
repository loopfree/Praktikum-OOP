// Steven
// 13520131
// BigNumber.cpp

#include "BigNumber.hpp"
#include <iostream>
using namespace std;

const int BigNumber::max_digit = 20;

BigNumber::BigNumber() {
  this->digit = new int[BigNumber::max_digit];
}

BigNumber::BigNumber(int number) {
  this->digit = new int[BigNumber::max_digit];
  for (int i = 0; i < BigNumber::max_digit; i++) {
    this->digit[i] = number % 10;
    number /= 10;
  }
}

BigNumber::BigNumber(string aVeryBigNumber) {
  this->digit = new int[BigNumber::max_digit];
  int strSize = aVeryBigNumber.size();
  for (int i = 0; i < strSize; i++) {
    this->digit[i] = aVeryBigNumber[strSize - 1 - i] - '0';
  }
}

BigNumber::BigNumber(const BigNumber& bn) {
  this->digit = new int[BigNumber::max_digit];
  for (int i = 0; i < BigNumber::max_digit; i++) {
    this->digit[i] = bn[i];
  }
}

int BigNumber::getMaxDigit() {
  return BigNumber::max_digit;
}

void BigNumber::setDigit(int i, int digit) {
  this->digit[i] = digit;
}

int& BigNumber::operator[](int i) {
  return this->digit[i];
}

int BigNumber::operator[](int i) const {
  return this->digit[i];
}

BigNumber::~BigNumber() {
  delete[] this->digit;
}

// hint   : gunakan operator overload [] untuk mengakses digit
// contoh : other[i]
// hint   : untuk this, dapat langsung menggunakan this->digit[i]
bool BigNumber::operator==(const BigNumber& other) {
  for (int i = BigNumber::getMaxDigit() - 1; i >= 0; i--) {
    if (this->digit[i] != other.digit[i])
    {
        return false;
    }
  }
  return true;
}

bool BigNumber::operator<(const BigNumber& other) {
    // this => kiri
    // other => kanan
    bool ans = false;
    for (int i=0; i<BigNumber::getMaxDigit(); i++)
    {
        if (this->digit[i] > other.digit[i])
        {
            ans = false;
        }

        if (this->digit[i] < other.digit[i])
        {
            ans = true;
        }

    }

    return ans;
}

bool BigNumber::operator>(const BigNumber& other) {
    // this => kiri
    // other => kanan
    bool ans = false;
    for (int i=0; i<BigNumber::getMaxDigit(); i++)
    {
        if (this->digit[i] > other.digit[i])
        {
            ans = true;
        }

        if (this->digit[i] < other.digit[i])
        {
            ans = false;
        }

    }

    return ans;
}

BigNumber BigNumber::operator+(const BigNumber& other) {
  BigNumber c;
  int bonus = 0;
  // hint: gunakan operator overload [] untuk mengakses dan mengubah digit
  // contoh:
  // - c[i] = this->digit[i]
  // - c[i] = other[i]
  for (int i = 0; i < BigNumber::getMaxDigit(); i++) {
    int temp;
    temp = this->digit[i] + other.digit[i] + bonus;
    bonus = 0;
    if (temp < 10)
    {
        c[i] = temp;
    }
    else
    {
        c[i] = temp % 10;
        bonus = temp / 10;
    }
  }
  return c;
}
