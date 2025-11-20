public class SearchinganElement {
    public static void main(String[] args) {
        int [] arr = {11, 45, 67, 98, 7, 0, 12};
        int target = 67;
        int ans = linears(arr, target);
        System.out.println(ans);
    }

    static int linears(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
