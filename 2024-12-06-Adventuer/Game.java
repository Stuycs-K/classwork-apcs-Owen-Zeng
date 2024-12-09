import java.util.Scanner;


public class Game{




    public static void main(String args[]){
      Adventurer Steve = new BardBarian("Steve", 15, 5);
      Adventurer Alex = new CodeWarrior("Alex", 12);

      while(Steve.getHP() > 0 && Alex.getHP( > 0)){
        System.out.print(Steve.toString() +", " + Steve.getHP() + "/" + Steve.getmaxHP() + " HP" + ", " + Steve.getSpecial() + "/" + Steve.getSpecialMax() + " " + Steve.getSpecialName());
        System.out.println();
        System.out.print(Alex.toString() +", " + Alex.getHP() + "/" + Alex.getmaxHP() + " HP" + ", " + Alex.getSpecial() + "/" + Alex.getSpecialMax() + " " + Alex.getSpecialName());
        System.out.println();

        System.out.println();
        Scanner input = new Scanner(System.in);
      }


    }
}
