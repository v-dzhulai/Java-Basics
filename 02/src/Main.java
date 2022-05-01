public class Main {
    public static void main(String[] args) {
//        rectangleInfo(5, 8);
//        rectangleInfo(3, 10);

//        boolean num1 = isEven(4);
//        boolean num2 = isEven(7);
//        boolean num3 = isEven(9);
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void rectangleInfo(int a, int b) {
        int perimeter = a * 2 + b * 2;
        int square    = a * b;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Square: "    + square);
        System.out.println("--------------------");
    }
}
