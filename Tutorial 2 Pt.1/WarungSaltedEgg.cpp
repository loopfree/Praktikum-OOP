// Steven
// 13520131
// WarungSaltedEgg.cpp

#include "WarungSaltedEgg.hpp"
#include <iostream>

using namespace std;

WarungSaltedEgg::WarungSaltedEgg(int uang, int nasi, int telur, int telurAsin, int ayam){
    this.uang = uang;
    this.nasi = nasi;
    this.telur = telur;
    this.telurAsin = telurAsin;
    this.ayam = ayam;
}

// Resep Nasi Ayam Salted Egg
//     1 Nasi
//     1 Telur
//     3 Telur Asin
//     1 Ayam
// Jika bahan yang dibutuhkan kurang, kembalikan false.
// Jika cukup, hitung pendapatan total. Pendapatan total dihitung dengan jumlah pesanan dikali 30000
// Setelah itu, tambahkan pendapatan total ke uang. Kembalikan true.

WarungSaltedEgg::masak(int pesanan){
    if (nasi>=pesanan && telur>=pesanan && telurAsin>=3*pesanan && ayam>=pesanan){
        uang += pesanan*30000;
        return true;
    }
    return false;
}
