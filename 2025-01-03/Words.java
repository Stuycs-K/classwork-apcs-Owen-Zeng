public class Words{

  public static void main(String[] args){

  }

  public static void makeWords(int remainingLetters, String result , String alphabet){
    if(remainingLetters == 1){
      for(int i = 0; i < alphabet.length; i++){
        System.out.println(result + alphabet.charAt(i));
      }
    }

    for(int i =0; i < remainingLetters; i++){
      makeWords(remainingLetters-1, result + letter, alphabet)

    }
  }
}
