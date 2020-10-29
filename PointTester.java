public class PointTester {
    public static void main (String[] args) {
        Point a = new Point(0,3);
        Point b = new Point(4,0);
        double c = a.distanceTo(b);
        System.out.println("Distance from (0,3) --> (4,0) = 5 | "+ c);
    }
    
}
