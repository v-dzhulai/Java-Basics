public class Main {
    public static void main(String[] args) {
        markStringEnds("hello");
        markStringEnds("example");
        markStringEnds("Bob");
        markStringEnds("ALICE");
        markStringEnds("wow!");
        markStringEnds("o");
    }

    public static void markStringEnds(String str) {
        char[] arr1 = str.toCharArray();

        String[] arr2 = new String[2];
        arr2[0] = String.valueOf(arr1[0]).toUpperCase() + str.substring(1);
        arr2[1] = str.substring(0, arr1.length - 1) + String.valueOf(arr1[arr1.length - 1]).toUpperCase();

        System.out.format("['%s', '%s']\n", arr2[0], arr2[1]);
    }
}