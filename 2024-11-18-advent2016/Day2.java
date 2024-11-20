import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2{
  public static String bCode(){
    String ans = "";

    String[][] pad= new String[][]{{"1","2","3"},{"4","5","6"},{"7","8","9"}};

    try {
      File file = new File("input.txt");//1
      Scanner input = new Scanner(file);

      int x= 1, y=1;

      while(input.hasNextLine()){
        String line = input.nextLine();
        System.out.println(line);
        
        for(int i =0; i < line.length(); i++){
          switch (line.charAt(i)){
            case 'U':
              x--;
              System.out.println(x + "," + y);
              break;
            case 'R':
              y++;

              System.out.println(x + "," + y);

              break;
            case 'D':
              x++;
              System.out.println(x + "," + y);
              break;
            case 'L':
              y--;
              System.out.println(x + "," + y);
              break;
          }
          if(x < 0){
            x= 0;
          }
          if(y < 0){
            y=0;
          }
          if(y> 2){
            y = 2;
          }
          if(x>2){
            x = 2;
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
