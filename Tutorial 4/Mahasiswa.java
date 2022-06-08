class Mahasiswa implements Comparable<Mahasiswa> {
    private float ipk;
    private int kodeJurusan;
    private int angkatan;
    
    public Mahasiswa(int kodeJurusan, int angkatan, float ipk) {
        this.ipk = ipk;
        this.kodeJurusan = kodeJurusan;
        this.angkatan = angkatan;
    }
    
    public float getIpk() {
        return ipk;
    }
    
    public int getKodeJurusan() {
        return kodeJurusan;
    }
    
    public int getAngkatan() {
        return angkatan;
    }
    
    public int compareTo(Mahasiswa m) {
        if(kodeJurusan < m.kodeJurusan) {
            return -1;
        } else if(kodeJurusan > m.kodeJurusan) {
            return 1;
        } else {
            if(angkatan > m.angkatan) {
                return -1;
            } else if(angkatan < m.angkatan) {
                return 1;
            } else {
                if(ipk > m.ipk) {
                    return -1;
                } else if(ipk < m.ipk) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        // if(this.ipk == m.ipk) {
        //     return 0;
        // } else if(this.ipk > m.ipk) {
        //     return 1;
        // } else {
        //     return -1;
        // }
    }
}