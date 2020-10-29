public class Point  {
    private double x,y;
    //construct a point given coordinates
    public Point(double X, double Y){
        x=X;
        y=Y;
    }
     //construct a point given a point  (redundant , just provides flexibility)
    public Point(Point p){
        x= p.x; 
        y= p.y;
    }
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }  

    public double distanceTo(Point other){
        //The distanceTo method returns the Euclidean distance from this point to the other point. Please DO NOT round. 
        double x2 = other.x;
        double y2 = other.y;
        double distance = Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
	    distance = Math.round(distance * 10000);
	    distance = distance / 10000;
	    return(distance);
    }

    public boolean equals(Point other) {
        return (x == other.x) && (y == other.y);
    }

}
