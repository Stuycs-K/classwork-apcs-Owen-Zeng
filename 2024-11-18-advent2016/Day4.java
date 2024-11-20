import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day4 {
    
    public static int sectorSum(){

        int sectorSum = 0;

        try {
            File file = new File("input.txt");//1
            Scanner input = new Scanner(file);

            while(input.hasNextLine()){
                String line = input.nextLine();
                
            }

            input.close();
        }catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        }
        return sectorSum;
    }
}
