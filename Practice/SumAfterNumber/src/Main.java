import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getSum(new int[] {1, 2, 3}, 1));
        System.out.println(getSum(new int[] {3, 3, 3}, 3));
        System.out.println(getSum(new int[] {10, 2, 50, 3, 4, 0}, 50));
        System.out.println(getSum(new int[] {10, 2, 50, 3, 4, 0}, -100));
        System.out.println(getSum(new int[] {10}, 10));
    }

    public static int getSum(int[] values, int startValue) {
        boolean isVal = false;
        for(int i : values) if(i == startValue) isVal = true;
        if(!isVal) return 0;

        int sum = 0;
        int ind = 0;

        for(int i = 0; i < values.length; i++) {
            if(values[i] == startValue){
                ind = i;
                break;
            }
        }

        for(int i = 0; i < values.length; i++) {
            if(i > ind) sum += values[i];
        }

        return sum;
    }
}