public class Main {
    public static void main(String[] args) {
        Bentuk bentuk1 = new PersegiPanjang("Merah", 3, 5);
        Bentuk bentuk2 = new Segitiga("Biru", 6, 9);
        Bentuk bentuk3 = new PersegiPanjang("Hijau", 2.5, 8);
        Bentuk bentuk4 = new Segitiga("Hitam", 7, 5);;

        System.out.println("Output bentuk");
        System.out.println(bentuk1.getInfo() + " dengan luas " + bentuk1.getLuas());
        System.out.println(bentuk2.getInfo() + " dengan luas " + bentuk2.getLuas());
        System.out.println(bentuk3.getInfo() + " dengan luas " + bentuk3.getLuas());
        System.out.println(bentuk4.getInfo() + " dengan luas " + bentuk3.getLuas());

        System.out.println("\nContoh pembentukan array of objects");
        Bentuk[] ListBentuk = new Bentuk[4];
        ListBentuk[0] = new PersegiPanjang("Kuning", 2, 8);
        ListBentuk[1] = new Segitiga("Ungu", 9, 11);
        ListBentuk[2] = new PersegiPanjang("Putih", 3, 9);
        ListBentuk[3] = new Segitiga("Ungu", 7.5, 10);

        for (Bentuk l : ListBentuk) {
            System.out.println(l.getInfo() + " dengan luas " + l.getLuas());
        }
    }
}
