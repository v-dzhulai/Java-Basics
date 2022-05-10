import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getHighestAndLowestAge(new int[] {10, 40, 36}));
        System.out.println(getHighestAndLowestAge(new int[] {60, 4, 14, 20, 97}));
        System.out.println(getHighestAndLowestAge(new int[] {35}));
    }

    public static String getHighestAndLowestAge(int[] ages) {
        int max = Arrays.stream(ages).max().getAsInt();
        int min = Arrays.stream(ages).min().getAsInt();
        return Arrays.toString(new int[] {max, min});
    }
}