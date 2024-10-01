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

    public static void main(String[] args) {
        int[][] empty2D = new int[3][0]; // empty rows
        int[][] rectangular2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; // [4][3]
        int[][] square2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // [3][3]
        int[][] ragged2D = {{1, 2, 3, 4, 5, 6}, {7}, {8, 9}, {10, 11, 12, 13}}; // ragged with varying lengths

        // arrToString tests with 2D arrays
        System.out.println("String tests: ");
        System.out.println(arrToString(empty2D));
        System.out.println(arrToString(rectangular2D));
        System.out.println(arrToString(square2D));
        System.out.println(arrToString(ragged2D));

        // 2D sum tests
        System.out.println("Sum tests: ");
        System.out.println(arr2DSum(empty2D));
        System.out.println(arr2DSum(rectangular2D));
        System.out.println(arr2DSum(square2D));
        System.out.println(arr2DSum(ragged2D));

        // swapRC tests
        System.out.println("swapRC tests: ");
        System.out.println(arrToString(swapRC(empty2D))); 
        System.out.println(arrToString(swapRC(rectangular2D))); 
        System.out.println(arrToString(swapRC(square2D))); 
        System.out.println(arrToString(swapRC(ragged2D))); // will create some arrays with 0 as other indexes because first array is larger.
    }
}
