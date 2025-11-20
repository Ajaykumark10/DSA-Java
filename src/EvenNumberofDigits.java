public class EvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {18, 124, 9, 1764, 98, 1};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count ++;
            }
        }
        return count;
    }

    //Checking whether the num contains even num or not
    static boolean even(int num) {
        int numberofDigits = digits(num);
        return numberofDigits % 2 == 0;

    }

    static int digits(int num){
        int count = 0;
        while (num > 0){
            count ++;
            num = num/10;
        }
        return count;
    }
}
