
public class MainProduk {

    public static void main(String[] args) {

        // Membuat objek produk biasa
        Produk produk1 = new Produk(
            "Buku", 50000
        );

        // Membuat objek produk elektronik
        ProdukElektronik produk2 = new ProdukElektronik(
            "Laptop", 10000000, 2
        );

        // Menampilkan informasi produk
        System.out.println("=== PRODUK BIASA ===");
        System.out.println(produk1.getInfo());

        System.out.println();

        System.out.println("=== PRODUK ELEKTRONIK ===");
        System.out.println(produk2.getInfo());
    }
}
