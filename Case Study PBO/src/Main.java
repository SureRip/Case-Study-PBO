// Program utama untuk menguji abstract class, inheritance, polymorphism, dan array of objects
public class Main {
    public static void main(String[] args) {
        // Membuat array of object bertipe Bentuk
        Bentuk[] daftarBentuk = new Bentuk[4];

        // Mengisi array dengan objek PersegiPanjang dan Segitiga
        daftarBentuk[0] = new PersegiPanjang("Biru", 4, 6);
        daftarBentuk[1] = new Segitiga("Hijau", 3, 7);
        daftarBentuk[2] = new PersegiPanjang("Merah", 2.5, 5);
        daftarBentuk[3] = new Segitiga("Kuning", 4, 8);

        // Menampilkan semua objek dalam array menggunakan polymorphism
        System.out.println("=== Daftar Bentuk dan Luasnya ===");
        for (Bentuk b : daftarBentuk) {
            System.out.println(b.getInfo() + " → Luas: " + b.getLuas());
        }

        // Contoh perhitungan total luas semua bentuk
        double totalLuas = 0;
        for (Bentuk b : daftarBentuk) {
            totalLuas += b.getLuas();
        }

        System.out.println("\nTotal luas semua bentuk: " + totalLuas);
    }
}
