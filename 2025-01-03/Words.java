import java.util.ArrayList;

public class Words{

  public static void main(String[] args){
    ArrayList<String> arr = new ArrayList<String>();
    System.out.println(makeWords(3, "", "89", arr));
  }

  public static ArrayList<String>  makeWords(int remainingLetters, String result , String alphabet, ArrayList<String> words){
    if(remainingLetters == 0){
        words.add(result);
    }


    else{
      for(int i =0; i < alphabet.length(); i++){
        if(result.length() > 0){
          if(result.charAt(result.length()- 1) != alphabet.charAt(i)){
            makeWords(remainingLetters-1, result + alphabet.charAt(i), alphabet, words);
          }
        }
        else{
          makeWords(remainingLetters-1, result + alphabet.charAt(i), alphabet, words);
        }
      }
    }
    return words;
  }
}
