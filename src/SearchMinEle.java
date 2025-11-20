import java.io.InterruptedIOException;

public class SearchMinEle {
    public static void main(String[] args) {
        int [] arr = {11, 45, 67, 98, 7, 0, 12};
        int min = arr[0];
        int ans = linears(arr, min);
        System.out.println(ans);
    }

    static int linears(int[] arr, int min){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];

            }
        }
        return min;
    }
}
