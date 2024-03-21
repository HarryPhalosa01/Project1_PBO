package FilkomTravel;

import java.time.LocalDate;

public class Pelanggan {
    private String nama, alamat, nomorTelepon;
    private int jumlahPenumpang;
    private LocalDate tanggalAwal, tanggalAkhir;
    private Pemesanan pemesanan;

    public Pelanggan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public LocalDate getTanggalAwal() {
        return tanggalAwal;
    }

    public void setTanggalAwal(LocalDate tanggal) {
        this.tanggalAwal = tanggal;
    }

    public LocalDate getTanggalAkhir() {
        return tanggalAkhir;
    }

    public void setTanggalAkhir(LocalDate tanggal) {
        this.tanggalAkhir = tanggal;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setPemesanan(Pemesanan pesan) {
        pemesanan = pesan;
    }

    public Pemesanan getPemesanan() {
        return pemesanan;
    }
}
