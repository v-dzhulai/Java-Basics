import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(countTheMonkeys(5));
        System.out.println(countTheMonkeys(8));
        System.out.println(countTheMonkeys(0));
    }

    public static String countTheMonkeys(int count) {
        int[] arr = new int[count];
        for(int i = 1; i <= count; i++) arr[i - 1] = i;
        return Arrays.toString(arr);
    }
}