public class Main {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "Hello world!";
        String str3 = "Hello!";

        System.out.println(compareStrings(str1, str2));
        System.out.println(compareStrings(str1, str3));
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}