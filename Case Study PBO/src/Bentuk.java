abstract class Bentuk {
    public String warna;

    public Bentuk(String w) {
        warna = w;
    }

    public String getWarna() {
        return warna;
    }

    public abstract double getLuas();
    public abstract String getInfo();
}