#ifndef __BUNCH_OF_KEYS_HPP__
#define __BUNCH_OF_KEYS_HPP__

#include <iostream>
using namespace std;

class BunchOfKeys {
  public:
    // ctor
    BunchOfKeys();

    // member function
    void add();
//    add: menambah kunci (hanya melakukan increment pada atribut n_keys)
    void shake();
//    shake: mengeluarkan bunyi "krincing" sejumlah n_keys kali
//    (setiap "krincing" diakhiri end-of-line) apabila jumlah kunci > 1,
//    atau mengeluarkan pesan "Tidak terjadi apa-apa" (diakhiri end-of-line)
//    apabila jumlah kunci <= 1.

  private:
    int n_keys; // jumlah kunci yg ada
};

#endif
