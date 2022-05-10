import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getStringArray(new boolean[] {true, false}));
        System.out.println(getStringArray(new boolean[] {false}));
        System.out.println(getStringArray(new boolean[] {}));
    }

    public static String getStringArray(boolean[] arr1) {
        String[] arr2 = new String[arr1.length];
        for(int i = 0; i < arr1.length; i++) arr2[i] = arr1[i] ? "Yes" : "No";
        return Arrays.toString(arr2);
    }
}