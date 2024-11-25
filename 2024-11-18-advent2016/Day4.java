import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Day4 {

    public static int sectorSum(){

        int sectorSum = 0;
        HashMap<String, Integer> map =  new HashMap<>();


        try {
            File file = new File("input.txt");//1
            Scanner input = new Scanner(file);

            while(input.hasNextLine()){
                String line = input.nextLine();
                for(int i = 0; i < line.length() - 9; i++){
                  if(! map.containsKey(line.substring(i, i+1)) && Character.isAlphabetic(line.charAt(i))){
                    map.put(line.substring(i,i+1), 1);
                  }
                  else if(Character.isAlphabetic(line.charAt(i))){
                    map.put(line.substring(i,i+1), map.get(line.substring(i,i+1)));
                  }
                }
            }

            input.close();
        }catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        }
        return sectorSum;
    }
}
