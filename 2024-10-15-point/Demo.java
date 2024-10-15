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
    Point p5 = new Point(p4);

    System.out.println( p3);
    System.out.println(p4);
    System.out.println(p5);

    System.out.println( distance(p1,p2));
    System.out.println( distance(p3,p2)); //
    System.out.println( )

    System.out.println( Point.distance(p1,p2));
    System.out.println( Point.distance(p5 ,p1));

    System.out.println( p1.distanceTo(p2));
    System.out.println( p4.distanceTo(p1));
  }
}
