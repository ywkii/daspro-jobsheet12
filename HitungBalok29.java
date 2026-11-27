public class HitungBalok29 {
    static int hitungLuas(int pjg, int lb) {
        return pjg * lb;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        return hitungLuas(a, b) * tinggi;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {
        int[][] balok = {
            {4, 3, 5},
            {6, 2, 4},
            {8, 5, 3}
        };

        for (int i = 0; i < balok.length; i++) {
            int p = balok[i][0];
            int l = balok[i][1];
            int t = balok[i][2];

            System.out.println("Balok ke-" + (i + 1) + " (" + p + "x" + l + "x" + t + "):");
            System.out.println("  Luas Permukaan = " + hitungLuasPermukaanBalok(p, l, t));
            System.out.println("  Volume         = " + hitungVolume(t, p, l));
        }
    }
}