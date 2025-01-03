import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day1{


  public static int distance(){
    int vertical = 0;
    int horizontal = 0;
    int rotation = 0;

    try {
      File file = new File("input.txt");//1
      Scanner input = new Scanner(file);

      ArrayList<String> places = new ArrayList<>();

        while(input.hasNext()){
          String nextDir = input.next();
          if(nextDir.contains("R")){
            rotation += 90;
          }
          else{
            rotation -= 90;
          }

          if(rotation == 360){
            rotation = 0;
          }
          if(rotation == -90){
            rotation = 270;
          }



          if(rotation == 0){
            nextDir = nextDir.replace(",", "");

            for (int i = 0; i < Integer.parseInt(nextDir.substring(1,nextDir.length() )); i++){
              vertical ++;
            }

          }
          if(rotation == 90){
            nextDir = nextDir.replace(",", "");
            for (int i = 0; i < Integer.parseInt(nextDir.substring(1,nextDir.length() )); i++){
              horizontal ++;
            }
          }
          if(rotation == 180){
            nextDir = nextDir.replace(",", "");
            for (int i = 0; i < Integer.parseInt(nextDir.substring(1,nextDir.length() )); i++){
              horizontal --;
            }
          }
          if(rotation == 270){
            nextDir = nextDir.replace(",", "");
            for (int i = 0; i < Integer.parseInt(nextDir.substring(1,nextDir.length() )); i++){
              horizontal --;
            }

          }
          if(places.contains(horizontal + ", " + vertical)){
            System.out.println(horizontal + ", " + vertical);
            break;
          }
          else{
            places.add(horizontal + ", " + vertical);
          }
        }
        input.close();
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return Math.abs(vertical) + Math.abs(horizontal); //you can return from a void function just don't put a value.
    }
    System.out.println(vertical + " " + horizontal);
    return Math.abs(vertical) + Math.abs(horizontal);
    
  }

}
