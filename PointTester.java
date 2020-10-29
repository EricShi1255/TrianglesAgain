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
        System.out.println();

        Triangle banecat = new Triangle(0.1,0.1,-1.9,0.1,-0.9,-1.632051);
        System.out.println("Perimeter {0.1,0.1,-1.9,0.1,-0.9,-1.632051} --> 6... | " + banecat.getPerimeter());
        System.out.println("Area {0.1,0.1,-1.9,0.1,-0.9,-1.632051} --> 1.7321 | " + banecat.getArea());
        System.out.println("Classify {0.1,0.1,-1.9,0.1,-0.9,-1.632051} --> equilateral| " + banecat.classify() ); // equilateral 
        System.out.println(banecat.toString());
        Point d = new Point(5,5);
        banecat.setVertex(0, d);
        System.out.println(banecat.toString());
    }
    
}
