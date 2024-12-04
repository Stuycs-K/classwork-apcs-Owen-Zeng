public class ColorDemo{

    public static final int Black =  30;
    public static final int Red =  31;
    public static final int Green =  32;
    public static final int Yellow =  33;
    public static final int Blue =  34;
    public static final int Magenta =  35;
    public static final int Cyan =  36;
    public static final int White =  37;
    
    
    
    public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";



  public static void main(String[] args){
    System.out.print(HIDE_CURSOR);
    // System.out.println("\u001b[1;4]");
    System.out.print("\u001b[48;2;0;100;0;1m.");
    System.out.println("\u001b[33m");
    System.out.println("This shade of green is pretty good");

    for(int i = 100; i < 220; i += 20){
      System.out.println("\u001b[48;2;0;" + i + ";0;1m");
      System.out.println("\u001b[33m");
      System.out.println("Its getting slightly worse every time");
    }
    System.out.println("\u001b[48;2;0;240;0;1m");    
    System.out.print("this just looks ugly now");

    for(int i =0; i <  100; i+= 15){
      System.out.println("\u001b[34m");
      System.out.println("\u001b[48;2;" + (75 + i) + ";0;" + (130 + i) + ";1m");
      System.out.println("most shades of purple are pretty good though");
    }
    System.out.println("\u001b[48;2;65;0;115;1m");
    System.out.print("cyan on dark purple looks decent too");

    

    System.out.print("\u001b[0m");
    System.out.print("\033[49m");
    System.out.print(SHOW_CURSOR);
  }
}
