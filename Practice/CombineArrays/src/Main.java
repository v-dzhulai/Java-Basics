import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCombinedArray(new int[] {1, 2}, new int[] {3, 4}));
        System.out.println(getCombinedArray(new int[] {56}, new int[] {-32}));
        System.out.println(getCombinedArray(new int[] {}, new int[] {}));
        System.out.println(getCombinedArray(new int[] {}, new int[] {20, 10}));
    }

    public static String getCombinedArray(int[] arr1, int[] arr2) {
        int count = 0;
        int[] arr3  = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++) {count++; arr3[count-1] = arr1[i];}
        for(int i = 0; i < arr2.length; i++) {count++; arr3[count-1] = arr2[i];}

        return Arrays.toString(arr3);
    }
}