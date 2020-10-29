public class Triangle {
    private Point v1, v2, v3;

    public Triangle(Point a, Point b, Point c)  {
        v1 = a;
        v2 = b;
        v3 = c;
    }
    public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
        Point A = new Point(x1,y1);
        Point B = new Point(x2,y2);
        Point C = new Point(x3,y3);
        v1 = A;
        v2 = B;
        v3 = C;
    }
    public double getPerimeter() {
        //Return the area without any rounding.
        double sidea = v1.distanceTo(v2);
	    double sideb = v1.distanceTo(v3);
	    double sidec = v2.distanceTo(v3);
	    double p = sidea+sideb+sidec;
	    return(p);
    }

    public double getArea() {
        //Return the area using Heron's formula without any rounding.
        double sidea = v1.distanceTo(v2);
	    double sideb = v1.distanceTo(v3);
	    double sidec = v2.distanceTo(v3);
	    double subp = (sidea+sideb+sidec)/2;
	    double area = Math.sqrt(subp*(subp-sidea)*(subp-sideb)*(subp-sidec));
	    return(area);
    }
    public String classify() {
        double sidea = v1.distanceTo(v2);
	    double sideb = v1.distanceTo(v3);
	    double sidec = v2.distanceTo(v3);
        sidea = Math.round(sidea * 10000);
        sidea = sidea / 10000;
        sideb = Math.round(sideb * 10000);
        sideb = sideb / 10000;
        sidec = Math.round(sidec * 10000);
        sidec = sidec / 10000;
        if ((sidea == sideb) && (sidea == sidec)) {
            return("equilateral");
        }
        if (!((sidea == sideb) || (sidea == sidec) || (sideb == sidec))) {
            return("scalene");
        }
        else {
            return("isosceles");
        }
    }
    public String toString() {
        return( "v1(" + v1.getX() + ", " + v1.getY() + ") " + "v2(" + v2.getX() + ", " + v2.getY() + ") " + "v3(" + v3.getX() + ", " + v3.getY() + ")");
    }
    public void setVertex(int index, Point newP) {
        if (index == 0){
            v1 = newP;
        }
        if (index == 1) {
            v2 = newP;
        }
        else {
            v3 = newP;
        }
    }
	
}
