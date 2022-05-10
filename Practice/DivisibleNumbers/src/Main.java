import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDivisibleNumbers(new int[] {2, 5, 8, 0, 7, 1, -4}, 1));
        System.out.println(getDivisibleNumbers(new int[] {2, 5, 8, 0, 7, 1, -4}, 2));
        System.out.println(getDivisibleNumbers(new int[] {2, 5, 8, 0, 7, 1, -4}, 3));
        System.out.println(getDivisibleNumbers(new int[] {2, 5, 8, 0, 7, 1, -4}, 4));
    }

    public static String getDivisibleNumbers(int[] nums, int divider) {
        int count = 0;
        int k     = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] % divider == 0) {
                count++;
            }
        }

        int[] arr = new int[count];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && nums[i] % divider == 0) {
                k++;
                arr[k-1] = nums[i];
            }
        }

        return Arrays.toString(arr);
    }
}