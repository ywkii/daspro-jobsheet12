import java.util.Scanner;

public class Kafe29{
    public static void Menu(String namaPelanggan, boolean isMember) {
        if (isMember) {
            System.out.println("Selamat datang, " + namaPelanggan + "!");
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000,12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
    public static int hitungDiskon(int total, String kodePromo, boolean isMember){
        int diskon = 0;

        if (kodePromo.equals("DISKON50")){
            diskon += (total * 50) / 100;
        } else if (kodePromo.equals("DISKON30")){
            diskon += (total * 30) / 100;
        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember){
            diskon += (total * 10) / 100;
        }
        return diskon;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        int totalHarga = 0;
        String pesanLagi;

        do{
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6){
                System.out.println("Menu tidak tersedia");
            } else {
                System.out.print("Masukkan jumlah item yang ingin dipesan: ");
                int banyakItem = sc.nextInt();
                totalHarga += hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
            }
            System.out.print("Apakah ingin memesan menu lain (y/n)? ");
            pesanLagi = sc.next();
        } while (pesanLagi.equalsIgnoreCase("y"));

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.next();

        int besarDiskon = hitungDiskon(totalHarga, kodePromo, true);
        int totalBayar = totalHarga - besarDiskon;

        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Besar diskon: Rp" + besarDiskon);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);
        sc.close();
    }
}