// Abstract Class
abstract class Bentuk {
    private String warna;

    public Bentuk(String w) {
        warna = w;
    }

    public String getWarna() {
        return warna;
    }

    // ====== Method Abstract ======
    public abstract double getLuas();
    public abstract String getInfo();
}
