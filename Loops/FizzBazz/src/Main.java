public class Main {
    public static void main(String[] args) {
        int startNum = 28;
        int endNum   = 36;

        for (int i = startNum; i <= endNum; i++) {
            System.out.println(
                    i % 5 == 0 && i % 7 == 0 ? "fizzbuzz" :
                    i % 5 == 0 ? "fizz" :
                    i % 7 == 0 ? "buzz" : i
            );
        }
    }
}