import java.util.ArrayList;

public class Driver {
  public static void main(String[] args){
    ArrayList<String> rand = new ArrayList<>();

    rand = ArrayListPractice.createRandomArray(10);
    rand = ArrayListPractice.createRandomArray(200000);
    System.out.println(rand);
    ArrayListPractice.replaceEmpty(rand);
    System.out.println(rand);

    ArrayList<String> rand1 = new ArrayList<>();

    rand1 = ArrayListPractice.createRandomArray(10);
    rand1 = ArrayListPractice.createRandomArray(100000);
    System.out.println(rand1);
    System.out.println(ArrayListPractice.makeReversedList(rand1));

    System.out.println(ArrayListPractice.mixLists(rand, rand1));



  }
}
