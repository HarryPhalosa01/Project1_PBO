package FilkomTravel;

class Pelanggan {
    private Pemesanan pemesanan;

    public Pelanggan() {
    }

    public void setPemesanan(Pemesanan pesan) {
        pemesanan = pesan;
    }

    public Pemesanan getPemesanan() {
        return pemesanan;
    }
}