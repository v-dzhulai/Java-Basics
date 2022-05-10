public class Main {
    public static void main(String[] args) {
        System.out.println(getMiddleString("hello"));
        System.out.println(getMiddleString("1234"));
        System.out.println(getMiddleString("(())"));
        System.out.println(getMiddleString("Bob"));
        System.out.println(getMiddleString(""));
    }

    public static String getMiddleString(String str) {
        char[] strArr = str.toCharArray();

        return str.isEmpty() ? str :
               str.length() % 2 != 0 ? new StringBuilder().append(strArr[strArr.length / 2]).toString() :
               new StringBuilder().append(strArr[strArr.length / 2 - 1]).append(strArr[strArr.length / 2]).toString();
    }
}