// Subclass dari Bentuk
class PersegiPanjang extends Bentuk {
    private double lebar;
    private double tinggi;

    public PersegiPanjang(String w, double l, double t) {
        super(w); // memanggil konstruktor dari Bentuk
        lebar = l;
        tinggi = t;
    }

    @Override
    public double getLuas() {
        return lebar * tinggi; // luas persegi panjang
    }

    @Override
    public String getInfo() {
        return "Persegi Panjang dengan lebar " + lebar +
               ", tinggi " + tinggi + ", warna " + getWarna();
    }
}
