import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
        String text = "This is a sample\nOf how to read\ntext!";
        Scanner sc1 = new Scanner("This is a bunch of words");
        Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");

        // creates a Scanner object to read throug the String
        Scanner input = new Scanner(text);

        //you don't want a for loop here unless you know the size of the data set
        double num = 0.0;

        while(sc2.hasNext()){
          num += sc2.nextDouble();
          System.out.println(num);
        }


        // while(input.hasNext()){
        //   System.out.println(input.next());
        // }
        //
        // while(input.hasNextLine()){
        //   System.out.println(input.nextLine());
        //   System.out.println("wow");
        //   //do something with the next line of the file
      }
}
