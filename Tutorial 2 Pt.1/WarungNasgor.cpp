// Steven
// 13520131
// WarungNasgor.cpp

#include "WarungNasgor.hpp"
#include <iostream>

using namespace std;

WarungNasgor::WarungNasgor(int uang, int nasi, int telur, int kecap){
    this.uang = uang;
    this.nasi = nasi;
    this.telur = telur;
    this.kecap = kecap;
}

// Memasak menu Nasi Goreng
// Resep Nasi Goreng:
//     1 buah nasi
//     1 buah telur
//     1 buah kecap
// Jika bahan yang dibutuhkan kurang, kembalikan false.
// Jika cukup, hitung pendapatan total. Pendapatan total dihitung dengan jumlah pesanan dikali 15000
// Setelah itu, tambahkan pendapatan total ke uang. Kembalikan true.

WarungNasgor::masak(int pesanan){
    if (nasi>=pesanan && telur>=pesanan && kecap>=pesanan){
        uang += pesanan*15000;
        return true;
    }
    return false;
}
