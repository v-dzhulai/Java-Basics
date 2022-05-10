public class Main {
    public static void main(String[] args) {
        System.out.println(removeOddChars("hello"));
        System.out.println(removeOddChars("1234"));
        System.out.println(removeOddChars("(())"));
        System.out.println(removeOddChars("Bob"));
        System.out.println(removeOddChars(""));
    }

    public static String removeOddChars(String str) {
        if(str.isEmpty()) return str;

        StringBuilder newStr = new StringBuilder();
        char[] strArr        = str.toCharArray();

        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) newStr.append(strArr[i]);
        }

        return newStr.toString();
    }
}