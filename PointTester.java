public class PointTester {
    public static void main (String[] args) {
        Point a = new Point(0,3);
        Point b = new Point(4,0);
        Point a1 = new Point(0,3); 
        double ab = a.distanceTo(b);
        System.out.println("Distance from (0,3) --> (4,0) = 5 | "+ ab);
        System.out.println();
        
        System.out.println("(0,3) & (4,0) --> false | " + a.equals(b));
        System.out.println("(0,3) & (0,3) --> true | " + a.equals(a1));
        Sytem.out.println();
    }
    
}
