public class Driver{

    public static void main(String[] args) {
        Adventurer Bob = new BardBarian("Bob");
        Adventurer John = new BardBarian("John", 15, 7);


        System.out.println("Bob" + Bob.getSpecialName());
        System.out.println("John" + John.getSpecialName());

        System.out.println("B" + Bob.getSpecial());
        System.out.println("J" + John.getSpecial());        
        Bob.setSpecial(2);
        John.setSpecial(2);
        System.out.println("B" + Bob.getSpecial());
        System.out.println("J" + John.getSpecial());     
        System.out.println("B" + Bob.getSpecialMax() + "M");
        System.out.println("J" + John.getSpecialMax() + "M");           
        
        System.out.println();
        System.out.println("B: ");
        System.out.println(Bob.toString());
        System.out.println(Bob.getName());
        System.out.println(Bob.getHP() +" HP");
        System.out.println(Bob.getmaxHP() +" MAX HP");


        System.out.println();

        System.out.println("Attacks/Support: ");
        System.out.println(John.getHP());
        Bob.attack(John);
        System.out.println(John.getHP());
        System.out.println(John.support());
        System.out.println(John.getHP());
        System.out.println(Bob.specialAttack(John));
        System.out.println(Bob.getSpecial());
        System.out.println(John.getHP());
        // somehow john functions and supports
        System.out.println(John.getSpecial());
        System.out.println(John.support(Bob));
        System.out.println(Bob.getSpecial());

        






        


    }
}