public class Main {
    public static void main(String[] args) {
        int amount = 2000;
        double percent = 0.05;
        int expectedLimit = 2500;
        int resultYears = 0;

        while(amount < expectedLimit) {
            amount += (amount * percent);
            resultYears++;
        }

        System.out.printf("Credit period is maximum %d years!", resultYears - 1);
    }
}