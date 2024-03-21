package FilkomTravel;

import java.time.LocalDate;

class Pemesanan {
    private String alamat, nomorTelepon, namaPelanggan;
    private int jumlahPenumpang, idPemesanan;
    private long durasi;
    private LocalDate tanggalAwal, tanggalAkhir;
    private Kendaraan kendaraan;

    public Pemesanan() {
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setDurasi(long durasi) {
        this.durasi = durasi;
    }

    public void setTanggalAwal(LocalDate tanggal) {
        this.tanggalAwal = tanggal;
    }

    public LocalDate getTanggalAwal() {
        return tanggalAwal;
    }

    public void setTanggalAkhir(LocalDate tanggal) {
        this.tanggalAkhir = tanggal;
    }

    public LocalDate getTanggalAkhir() {
        return tanggalAkhir;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public void setIdPemesanan(int id) {
        idPemesanan = id;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    private int hitungTotalHarga(long durasi, int harga) {
        return (int) durasi * harga;
    }

    public Boolean validasiTanggal(long durasi) {
        if (durasi <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void display() {
        System.out.println("===========================================");
        System.out.printf(" %-18s : %s%n", "ID Pemesanan", idPemesanan);
        System.out.printf(" %-18s : %s%n", "Nama", namaPelanggan);
        System.out.printf(" %-18s : %s%n", "Alamat", alamat);
        System.out.printf(" %-18s : %s%n", "Nomor telepon", nomorTelepon);
        System.out.printf(" %-18s : %s%n", "Nomor Kendaraan", kendaraan.getNomorKendaraan());
        System.out.printf(" %-18s : %d orang%n", "Jumlah penumpang", jumlahPenumpang);
        System.out.printf(" %-18s : %d hari%n", "Durasi sewa", durasi);
        System.out.printf(" %-18s : Rp. %d%n", "Harga total", hitungTotalHarga(durasi, kendaraan.getHarga()));
        System.out.println("===========================================");
    }
}