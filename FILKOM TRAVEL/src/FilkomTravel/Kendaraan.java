package FilkomTravel;

class Kendaraan {
    private String nomorKendaraan;
    private int harga;

    public Kendaraan(String nomorKendaraan, int harga) {
        this.nomorKendaraan = nomorKendaraan;
        this.harga = harga;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public int getHarga() {
        return harga;
    }
}

class KendaraanBesar extends Kendaraan {
    public KendaraanBesar() {
        super("101", 100000);
    }
}

class KendaraanSedang extends Kendaraan {
    public KendaraanSedang() {
        super("102", 50000);
    }
}

class KendaraanKecil extends Kendaraan {
    public KendaraanKecil() {
        super("103", 25000);
    }
}