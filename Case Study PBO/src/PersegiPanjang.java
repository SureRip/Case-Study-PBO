class PersegiPanjang extends Bentuk {
    public double lebar;
    public double panjang;

    public PersegiPanjang(String w, double l, double p) {
        super(w); 
        lebar = l;
        panjang = p;
    }

    @Override
    public double getLuas() {
        return lebar * panjang; 
    }

    @Override
    public String getInfo() {
        return "Persegi Panjang dengan lebar " + lebar + ", dan panjang " + panjang + " memiliki warna " + getWarna();
    }
}