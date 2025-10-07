class Segitiga extends Bentuk {
    public double alas;
    public double tinggi;

    public Segitiga(String w, double a, double t) {
        super(w);
        alas = a;
        tinggi = t;
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi; 
    }

    @Override
    public String getInfo() {
        return "Sebuah segitiga memiliki alas " + alas + ", dan tinggi " + tinggi + " dengan warna " + getWarna();
    }
}