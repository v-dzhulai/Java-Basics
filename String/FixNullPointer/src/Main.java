public class Main {
    public static void main(String[] args) {
        String str1 = "Simple string!";
        String str2 = null;

        System.out.println(getUpperCase(str1));
        System.out.println(getUpperCase(str2));
    }

    public static String getUpperCase(String inputString) {
        if(inputString == null) return  "The string is null!";
        return inputString.toUpperCase();
    }
}