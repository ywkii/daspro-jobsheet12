public class HitungBalok29 {
    static int hitungLuas(int pjg, int lb){
        return pjg * lb;
    }
    static int hitungVolume(int tinggi, int a, int b){
        return hitungLuas(a, b) * tinggi;
    }
    static int hitungLuasPermukaanBalok(int p, int l, int t){
        return 2 * (hitungLuas(p,l) + hitungLuas(p, t) + hitungLuas(l, t));
    }
    public static void main(String[] args) {
        int p = 4, l = 3, t = 5;

        System.out.println("Urutan benar hitungVolume(t, p, l): " + hitungVolume(t, p, l));
        System.out.println("Urutan tertukar hitungVolume(p, l, t): " + hitungVolume(p, l, t));
    }
}