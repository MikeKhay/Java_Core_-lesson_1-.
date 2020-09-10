package homeWorks.other;

public class Nearestnumber4 {
    public static void main(String[] args) {
        float m = 8.5f;
        float n = 11.45f;
        float v = closestToTen(m, n);
        if (Float.isNaN(v)) System.out.println("Are the same ");
        else System.out.println("Up to 10: " + v);
    }
    static float closestToTen(float m, float n) {
        float d1 = Math.abs(m - 10);
        float d2 = Math.abs(n - 10);
        if (d1 == d2) return Float.NaN;
        return d1 < d2 ? m : n;
    }
}
