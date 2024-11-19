import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

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
        String[] arr = line.split(""\\|"");
        System.out.println(Arrays.toString(arr));

        for(int i =0; i < arr.length; i++){
          switch (arr[i]){
            case "U":
              y--;
              break;
            case "R":
              x++;
              break;
            case "D":
              y++;
              break;
            case "L":
              x--;
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
