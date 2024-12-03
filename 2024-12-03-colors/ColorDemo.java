public class ColorDemo{

    public static final String Black =  "\u001b[30m";
    public static final String Red =  "\u001b[31m";
    public static final String Green =  "\u001b[32m";
    public static final String Yellow =  "\u001b[33m";
    public static final String Blue =  "\u001b[34m";
    public static final String Magenta =  "\u001b[35m";
    public static final String Cyan =  "\u001b[36m";
    public static final String White =  "\u001b[37m";

  public static void main(String[] args){




    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
        System.out.println();
    }


    System.out.print("\u001b[31m");
    System.out.print("\u001b[1m");

    System.out.println("isthis red");
  }
}
