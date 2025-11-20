public class SearchMaxEle {
    public static void main(String[] args) {
        int [] arr = {11, 45, 67, 98, 7, 0, 12};
        int max = arr[0];
        int ans = linears(arr, max);
        System.out.println(ans);
    }

    static int linears(int[] arr, int max){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }
}
