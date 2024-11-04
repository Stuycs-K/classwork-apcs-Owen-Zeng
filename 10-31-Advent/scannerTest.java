import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class scannerTest{

    public static void main(String[] args) {
        Scanner sc = new Scanner("Some String or file here");

        String text = "This is a sample\nOf how to read\ntext!";

        // creates a Scanner object to read throug the String
        Scanner input = new Scanner(text);
  
        //you don't want a for loop here unless you know the size of the data set
  
        while(input.hasNext()){
          System.out.println(input.next());
        }

        input.close();

        Scanner sc1 = new Scanner("This is a bunch of words");

        while(sc1.hasNext()){
            System.out.println(sc1.next());
        }
        sc1.close();

        Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");

        double sum = 0.0;
        while(sc2.hasNext()){
            sum += sc2.nextDouble();
        }
        sc2.close();
        System.out.println(sum);






    }
}