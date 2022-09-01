package DetectSquares;

import java.util.HashMap;
import java.util.Map;

public class DetectSquares {
    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(int[] arr) {
            x=arr[0];
            y=arr[1];
        }

        @Override
        public int hashCode() {
            return x*31+y;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Point))
                return false;
            Point other = (Point) obj;
            return x==other.x && y==other.y;
        }
    }
    Map<Point,Integer> points ;
    public DetectSquares() {
        points=new HashMap<>();
    }

    public void add(int[] point) {
        Point p =new Point(point);
        points.put(p, points.getOrDefault(p,0) + 1);

    }

    public int count(int[] point) {
        int res = 0;
        int mult = 1 + points.getOrDefault(new Point(point), 0);
        for (var p:points.keySet()
             ) {
            if (Math.abs(p.x-point[0])!=Math.abs(p.y-point[1]) || p.x==point[0] || p.y==point[1])
                continue;
            res += mult * points.getOrDefault(new Point(p.x,point[1]), 0) * points.getOrDefault(new Point(point[0],p.y),0);
        }
        return res;
    }
}
