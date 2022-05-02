public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 0, 7, 0, 9, 6, 0};

        for(int i = numbers.length / 2; i < numbers.length; i++) {
            if(numbers[i] != 0) System.out.println(numbers[i]);
            else break;
        }
    }
}