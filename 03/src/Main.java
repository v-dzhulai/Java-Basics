public class Main {
    public static void main(String[] args) {
        int    income = 10500;
        double result = 0;

        if(income <= 1000) {
            result = income * 0.02;
        } else if(income <= 10000) {
            result = (1000 * 0.02) + ((income - 1000) * 0.03);
        } else if(income > 10000) {
            result = (1000 * 0.02) + (9000 * 0.03) + ((income - 10000) * 0.05);
        }

        System.out.println(result);
    }
}