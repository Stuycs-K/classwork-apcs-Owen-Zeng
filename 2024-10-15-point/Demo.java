public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getX() - b.getX()),2)+Math.pow((a.getY() - b.getY()),2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    // testing new Point constructor
    Point p4 = new Point(0,0);
    Point p5 = new Point(9,7);

    System.out.println( p3);
    System.out.println(p4);
    System.out.println(p5);

    System.out.println( distance(p1,p2));
    System.out.println( distance(p3,p4)); // 5

    System.out.println( Point.distance(p1,p2));
    System.out.println( Point.distance(p5 ,p1)); // 10

    System.out.println( p1.distanceTo(p2));
    System.out.println( p4.distanceTo(p1)); // root 2


    // triangle points
    Point v1 = new Point(0,0);
    Point v2 = new Point(1, 0);
    Point v3 = new Point (.5, Math.sqrt(.75));

    System.out.println(Point.distance(v1,v2));
    System.out.println(Point.distance(v2,v3));
    System.out.println(Point.distance(v1,v3));
    

    // output of all are 1 or .9 repeating, meaning this does create 3 points that would be vertexes of an equilateral triangle with side length 1.



  }
}
