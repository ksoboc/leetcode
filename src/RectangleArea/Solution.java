package RectangleArea;

public class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int axmin = Math.min(ax1, ax2);
        int axmax = Math.max(ax1, ax2);
        int aymin = Math.min(ay1, ay2);
        int aymax = Math.max(ay1, ay2);

        int bxmin = Math.min(bx1, bx2);
        int bxmax = Math.max(bx1, bx2);
        int bymin = Math.min(by1, by2);
        int bymax = Math.max(by1, by2);

        int union = (axmax - axmin) * (aymax - aymin) + (bxmax - bxmin) * (bymax - bymin);

        if (bxmin>axmax || bymin>aymax || bxmax<axmin || bymax<aymin)
            return union;

        int uxmin = Math.max(axmin, bxmin);
        int uxmax = Math.min(axmax, bxmax);
        int uymin = Math.max(aymin, bymin);
        int uymax = Math.min(aymax, bymax);

        int inter = (uxmax - uxmin) * (uymax - uymin);

        return union - inter;

    }
}
