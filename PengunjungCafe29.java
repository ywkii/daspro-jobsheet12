public class PengunjungCafe29 {
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Meja " + nomorMeja + " - Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga){
        int total = 0;
        for (int h : harga){
            total += h;
        }
        return total;
    }
    public static void main(String[] args){
        daftarPengunjung(1, "Ali", "Budi");

        System.out.println("Total (1 argumen): Rp" + hitungTotalBelanja(15000));
        System.out.println("Total (3 argumen): Rp" + hitungTotalBelanja(15000, 20000, 12000));
        System.out.println("Total (5 argumen): Rp" + hitungTotalBelanja(15000, 20000, 22000, 10000, 18000));
    }
}
