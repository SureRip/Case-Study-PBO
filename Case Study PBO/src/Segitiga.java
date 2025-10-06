// Subclass dari Bentuk
class Segitiga extends Bentuk {
    private double alas;
    private double tinggi;

    public Segitiga(String w, double a, double t) {
        super(w);
        alas = a;
        tinggi = t;
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi; // luas segitiga
    }

    @Override
    public String getInfo() {
        return "Segitiga dengan alas " + alas +
               ", tinggi " + tinggi + ", warna " + getWarna();
    }
}
