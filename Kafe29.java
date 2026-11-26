import java.util.Scanner;

public class Kafe29{
    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000,12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);

        System.out.println("Pemanggil tanpa menyimpan return value selesai. ");
        sc.close();
    }
}