import java.util.Scanner;


public class Game{
    public static void main(String args[]){
      Adventurer Steve = new BardBarian("Steve", 15, 5);
      Adventurer Alex = new CodeWarrior("Alex", 12);

      while(Steve.getHP() > 0 && Alex.getHP() > 0){
        System.out.print("Player: " + Steve.toString() +", " + Steve.getHP() + "/" + Steve.getmaxHP() + " HP" + ", " + Steve.getSpecial() + "/" + Steve.getSpecialMax() + " " + Steve.getSpecialName());
        System.out.println();
        System.out.print("Enemy: " + Alex.toString() +", " + Alex.getHP() + "/" + Alex.getmaxHP() + " HP" + ", " + Alex.getSpecial() + "/" + Alex.getSpecialMax() + " " + Alex.getSpecialName());
        System.out.println();

        System.out.println();
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");        
        Scanner input = new Scanner(System.in);

        String in = input.next();

        while(!in.equals("a") && !in.equals("sp") && !in.equals("su") && !in.equals("quit")){
          System.out.println("Invalid Response!");
          System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");        
          input = new Scanner(System.in);

          in = input.next();
        }

        if(in.equals("a")){
          System.out.println(Steve.attack(Alex));
        }

        if(in.equals("sp")){
          System.out.println(Steve.specialAttack(Alex));
        }
        if(in.equals("su")){
          System.out.println(Steve.support());
        }

        if(in.equals("quit")){
          break;
        }

        if(Alex.getHP() > 0){
          int rand = (int) (3* Math.random());

          if(rand == 0){
            System.out.println(Alex.attack(Steve));
          }
          if(rand == 1){
            System.out.println(Alex.support());
          }
          if(rand==2){
            System.out.println(Alex.specialAttack(Steve));
          }

        }


      }


    }
}
