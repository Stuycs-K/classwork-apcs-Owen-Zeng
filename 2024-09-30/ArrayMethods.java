// Qiyujinz@nycstudents.net Jason Zhang ;;; Owen Zeng owenz20@nycstudents.net
public class ArrayMethods {

    public static String aryToString(int[] nums) {
        String aryContent = "[";
        for (int i = 0; i < nums.length - 1; i++) {
            aryContent += nums[i] + ", ";
        }
        if (nums.length != 0)
            aryContent += nums[nums.length - 1];
        aryContent += "]";
        return aryContent;
    }

    // 3. Write arrToString, with a 2D array parameter.
    // Note: Different parameters are allowed with the same function name.
    /** Return a String that represents the 2D array in the format:
      * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
      * Note the comma+space between values, and between arrays
      * You are encouraged to notice that you may want to re-use
      * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
      */
    public static String arrToString(int[][] ary) {
        // this should use arrToString(int[])
        String ans = "[";

        for (int i = 0; i < ary.length - 1; i++) {
            ans += aryToString(ary[i]) + ", ";
        }
        if (ary.length != 0) {
            ans += aryToString(ary[ary.length - 1]);
        }
        ans += "]";
        return ans;
    }


    /* Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
        //use a nested loop to solve this
          int ans = 0;

          for(int i = 0; i < nums.length; i++){
              for (int j = 0; j < nums[i].length; j++){
                  ans += nums[i][j];
          }
        }
        return ans;
      }


    /** Rotate an array by returning a new array with the rows and columns swapped.
      * You may assume the array is rectangular and neither rows nor cols is 0.
      * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
      */
    public static int[][] swapRC(int[][] nums) {
        int[][] swapped = new int[nums[0].length][nums.length];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                swapped[j][i] = nums[i][j];
            }
        }
        return swapped;
    }


    //3. Modify a given 2D array of integer as follows:
    //Replace all the negative values:
    //-When the row number is the same as the column number replace
    //that negative with the value 1
    //-All other negatives replace with 0
    public static void replaceNegative(int[][] vals){
        for( int i =0; i< vals.length; i++){
          for (int j = 0; j < vals[i].length; j++){
            if(vals[i][j] < 0 && i == j){
              vals[i][j] = 1;
            }
            if(vals[i][j] < 0 && i != j){
              vals[i][j] = 0;
            }
          }
        }
}

    //4. Make a copy of the given 2d array.
    //When testing : make sure that changing the original does NOT change the copy.
    //DO NOT use any built in methods that "copy" an array.
    //You SHOULD write a helper method for this.
    //If you don't see a good way to do that, you should stop and look at prior methods.
    public static int[][] copy(int[][] nums){
        int[][] twoCopy = new int[nums.length][];

        for( int i =0; i < nums.length; i++){
            twoCopy[i] = new int[nums[i].length];
        }

        for (int i = 0; i < nums.length; i++){
            twoCopy[i] = oneCopy(nums[i]);
        }
        return twoCopy;
    }


    // helper funcion that copies 1D array
    public static int[] oneCopy(int[] ary){
        int[] copy = new int[ary.length];

        for(int i = 0; i < ary.length; i++){
            copy[i] = ary[i];
        }
        return copy;
    }



    public static void main(String[] args) {
        int[][] empty2D = new int[3][0]; // empty rows
        int[][] rectangular2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; // [4][3]
        int[][] square2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // [3][3]
        int[][] ragged2D = {{1, 2, 3, 4, 5, 6}, {7}, {8, 9}, {10, 11, 12, 13}}; // ragged with varying lengths
        int[][] negative2D = {{-1, -25, 25, 1}, {23, 34, -100, 0, -3}};

        // arrToString test
        System.out.println("String tests: ");
        System.out.println(arrToString(empty2D));
        System.out.println(arrToString(rectangular2D));
        System.out.println(arrToString(square2D));
        System.out.println(arrToString(ragged2D));

        // 2D sum test
        System.out.println("Sum tests: ");
        System.out.println(arr2DSum(empty2D));
        System.out.println(arr2DSum(rectangular2D));
        System.out.println(arr2DSum(square2D));
        System.out.println(arr2DSum(ragged2D));

        // swapRC test
        System.out.println("swapRC tests: ");
        System.out.println(arrToString(swapRC(empty2D)));
        System.out.println(arrToString(swapRC(rectangular2D)));
        System.out.println(arrToString(swapRC(square2D)));
        System.out.println(arrToString(swapRC(ragged2D))); // will create some arrays with 0 as other indexes because first array is larger.

        // replace negative test
        System.out.println("Replace Negative tests: ");
        System.out.println("Original Array" + arrToString(negative2D));
        replaceNegative(negative2D);
        System.out.println(arrToString(negative2D));

        // copy test
        System.out.println("Copy 2D array tests: ");
        System.out.println(ragged2D);
        System.out.println(copy(ragged2D));
        System.out.println("Address Same? : " + (ragged2D == copy(ragged2D)));
        System.out.println(arrToString(ragged2D));
        System.out.println(arrToString(copy(ragged2D)));

    }
}
