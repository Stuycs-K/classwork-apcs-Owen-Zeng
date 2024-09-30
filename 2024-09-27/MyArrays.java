public class MyArrays {
    public static String arrayToString(int[] array){
        String ans = "[";

        for (int i = 0; i < array.length; i++) {
            ans += array[i];
            if (i < array.length - 1) {
                ans += ", ";
            }
        }

        ans += "]";
        return ans;
    }

    public static int[] returnCopy(int[]ary){
        int[] newArray = new int[ary.length];

        for (int i = 0; i < ary.length; i++){
            newArray[i] = ary[i];
        } 
        return newArray;

    }

    public static int[] concatArray(int[]ary1, int[]ary2){
        int[] newArray = new int[ary1.length + ary2.length];

        for (int i = 0; i < ary1.length; i++){
        newArray[i] = ary1[i];
        } 

        for (int i = 0 ; i < ary2.length; i++){
        newArray[i + ary1.length] = ary2[i];
        } 
        return newArray;
    }



    public static void main(String[] args) {
        int[] nums = new int[] {23,363,7,45,697,4,2,12,34};
        int[] negatives = new int[] { -1, -5, -25, -154234365, -23};

        //tests 
        System.out.println(nums);
        System.out.println(returnCopy(nums));
        System.out.println("addresses different: " +  ! (nums == returnCopy(nums)));
        System.out.println("original :"  + arrayToString(nums));
        System.out.println("copy: " + arrayToString(returnCopy(nums)));


        System.out.println(nums);
        System.out.println(negatives);
        System.out.println(arrayToString(nums));
        System.out.println(arrayToString(returnCopy(negatives)));

        System.out.println(arrayToString(concatArray(nums, negatives)));
    }
}