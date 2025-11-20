public class MaxElementIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {2, 4, 5},
                {12, 22, 13, 54},
                {9, 8, 11, 10},
                {6, 7}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
