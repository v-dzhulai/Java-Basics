public class Main {
    public static void main(String[] args) {
        System.out.println(getCentury(1705));
        System.out.println(getCentury(1900));
        System.out.println(getCentury(1601));
        System.out.println(getCentury(2000));
    }

    public static int getCentury(int year) {
        return year % 100 == 0 ? year / 100 : year / 100 + 1;
    }
}