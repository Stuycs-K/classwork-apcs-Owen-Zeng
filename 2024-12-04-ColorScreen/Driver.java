public class Driver{

    public static void wholeRow(){
        for(int i = 0; i < 80; i++){
            Text.color(Text.background(Text.CYAN));
            System.out.print(" ");
        }
    }

    public static void numbersRow(){
        int[] arr = new int[3];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(100*Math.random());
        }

        for(int i =0; i < 80; i++){
            if(i == 20){
                if(arr[0] < 25){
                    Text.color((Text.RED));
                    System.out.print(arr[0]);
                }
                else if(arr[0] > 75){
                    Text.color((Text.GREEN));
                    System.out.print(arr[0]);
                }
                else{
                    Text.color((Text.CYAN));
                    System.out.print(arr[0]);

                }
            }

            else if(i == 40){
                if(arr[1] < 25){
                    Text.color((Text.RED));
                    System.out.print(arr[1]);
                }
                else if(arr[1] > 75){
                    Text.color((Text.GREEN));
                    System.out.print(arr[1]);
                }
                else{
                    Text.color((Text.CYAN));
                    System.out.print(arr[1]);

                }
            }

            else if(i == 60){
                if(arr[2] < 25){
                    Text.color((Text.RED));
                    System.out.print(arr[2]);
                }
                else if(arr[2] > 75){
                    Text.color((Text.GREEN));
                    System.out.print(arr[2]);
                }
                else{
                    Text.color((Text.CYAN));
                    System.out.print(arr[2]);

                }
            }
            else if(i == 0 || i == 77){ // supposed to be 79 but idk why it doesnt line up
                Text.color(Text.background(Text.CYAN));
                System.out.print(" ");
            }

            else{
                Text.color(Text.background(Text.BLACK));
                System.out.print(" ");
            }
        }
    }

    public static void filledRow(){
        for(int i = 0; i < 80; i++){
            Text.color(Text.background(Text.MAGENTA));
            System.out.print("-");
        }
    }

    public static void firstLast(){  // add parameter later if have time 
        for(int i = 0; i < 80; i++){
            if(i == 0 || i == 79){
                Text.color(Text.background(Text.CYAN));
                System.out.print(" ");
            }
            else{
                Text.color(Text.background(Text.BLACK));
                System.out.print(" ");
            }
        }
    }

    
    public static void main(String[] args){
        System.out.println(Text.CLEAR_SCREEN);
        System.out.println(Text.HIDE_CURSOR);

        

        for(int i = 0; i < 30; i++){
            if(i == 0 || i == 29){
                wholeRow();
                System.out.print(Text.BACKGROUND_RESET);
                System.out.println();

            }
            if(i == 1){
                numbersRow();
                System.out.print(Text.BACKGROUND_RESET);
                System.out.println();
            }
            if(i == 2){
                filledRow();
                System.out.print(Text.BACKGROUND_RESET);
                System.out.println();
            }
            else{
                firstLast();
                System.out.print(Text.BACKGROUND_RESET);
                System.out.println();
            }

        }
        System.out.println(Text.RESET);
    }

}
