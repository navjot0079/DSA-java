import java.util.*;

public class FractionalKnapsack {
    static class pair {
        int w;
        int v;
        double r;

        public pair(int w, int v) {
            this.w = w;
            this.v = v;
            this.r = (v * 1.0) / w;
        }

        public String toString() {
            return "(" + w + "," + v + "," + r + ")";
        }

    }

    public static void main(String[] args) {
        int wt[] = { 10, 20, 30 };
        int val[] = { 60, 100, 120 };
        int mw = 50;

        ArrayList<pair> list = new ArrayList<>();
        for (int i = 0; i < wt.length; i++) {
            pair pp = new pair(wt[i], val[i]);
            list.add(pp);
        }
        Collections.sort(list, new Comparator<pair>() {
            @Override
            public int compare(pair a1, pair a2) {
                return (int) (a2.r - a1.r);
            }
        });

        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            pair p = list.get(i);
            if (mw >= p.w) {
                total += p.v;
                mw -= p.w;
                if (mw <= 0) {
                    break;
                }

            } else {
                total = total + (int) (mw * p.r);
                mw -= p.w;
                if (mw <= 0) {
                    break;
                }
            }
        }
        System.out.println(list);
        System.out.println(total);
    }
}
