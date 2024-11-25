import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2{
  public static String bCode(){
    String ans = "";

    String[][] pad = {
      {"0", "0", "0", "0", "0", "0", "0"},{"0", "0", "0", "1", "0", "0", "0"},{"0", "0", "2", "3", "4", "0", "0"},{"0", "5", "6", "7", "8", "9", "0"},{"0", "0", "A", "B", "C", "0", "0"},{"0", "0", "0", "D", "0", "0", "0"},{"0", "0", "0", "0", "0", "0", "0"}
  };
  

    try {
      File file = new File("input.txt");//1
      Scanner input = new Scanner(file);

      int x= 3, y=1;
      System.out.println(pad[x][y]);

      while(input.hasNextLine()){
        String line = input.nextLine();
        System.out.println(line);
        
        for(int i =0; i < line.length(); i++){
          switch (line.charAt(i)){
            case 'U':
              int tempX0 = x;
              int tempY0 = y;
              x--;
              if(pad[x][y].equals("0")){
                x = tempX0;
                y= tempY0;
              }

              System.out.println(x + "," + y);
              break;
            case 'R':
              int tempX1 = x;
              int tempY1 = y;
              y++;
              if(pad[x][y].equals("0")){
                x = tempX1;
                y= tempY1;
              }

              System.out.println(x + "," + y);

              break;
            case 'D':
              int tempX2 = x;
              int tempY2 = y;
              x++;
              if(pad[x][y].equals("0")){
                x = tempX2;
                y= tempY2;
              }
              System.out.println(x + "," + y);
              break;
            case 'L':
              int tempX3 = x;
              int tempY3 = y;
              y--;
              if(pad[x][y].equals("0")){
                x = tempX3;
                y= tempY3;
              }
              System.out.println(x + "," + y);
              break;
          }

        }
        System.out.println(pad[x][y]);
        ans += pad[x][y];
      }

        input.close();
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
    }
    return ans;
  }
}
