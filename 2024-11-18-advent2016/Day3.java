import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day3{
    public static void main(String[] args) {
        System.out.println(countTriangesA("inputTri.txt"));
        System.out.println(countTrianglesB("inputTri.txt"));
    }

    public static boolean trianglePossiblity(int a, int b, int c){
        int ab = a+b;
        int bc = b+c;;
        int ca = c+a;

        return ab > c && bc > a && ca > b;
    }

    public static int countTriangesA(String filename){
        int count = 0;
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);

            while(input.hasNextLine()){
                if(trianglePossiblity(input.nextInt(), input.nextInt(), input.nextInt())){
                    count++;
                }
            }
            input.close();
        }catch (FileNotFoundException ex) {
            //File not found what should you do?
            System.out.println("File not found");
            return 0;//you can return from a void function just don't put a value.
        }
        return count;
    }

    public static int countTrianglesB(String filename){
        int count = 0;
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file);

            while(input.hasNextLine()){
                ArrayList<Integer> a = new ArrayList<Integer>();

                String line = input.nextLine();

                Scanner linescan1 = new Scanner(line);

                while (linescan1.hasNextInt()){
                    a.add(linescan1.nextInt());

                }
                System.out.println(a);
                linescan1.close();

                ArrayList<Integer> b = new ArrayList<Integer>();

                String line2 = input.nextLine();

                Scanner linescan2 = new Scanner(line2);

                while (linescan2.hasNextInt()){
                    b.add(linescan2.nextInt());
                }
                linescan2.close();

                ArrayList<Integer> c = new ArrayList<Integer>();

                String line3 = input.nextLine();

                Scanner linescan3 = new Scanner(line3);

                while (linescan3.hasNextInt()){
                    c.add(linescan3.nextInt());
                }

                while(linescan3.hasNext()){
                  System.out.println(a.get(0) + " " + b.get(0) + " " + c.get(0));
                    if(trianglePossiblity(a.get(0), b.get(0), c.get(0))){
                        count ++;
                    }
                }
                linescan3.close();

                System.out.println(a);

                for(int i = 0; i < a.size(); i++){
                    if(trianglePossiblity(a.get(i), b.get(i), c.get(i))){
                        count++;
                    }
                }
            }




            input.close();
        }catch (FileNotFoundException ex) {
            //File not found what should you do?
            System.out.println("File not found");
            return 0;//you can return from a void function just don't put a value.
        }
        return count;
    }

}