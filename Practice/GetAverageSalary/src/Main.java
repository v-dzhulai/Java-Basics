import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getAverageSalary(new double[] {1000.00, 500.00}));
        System.out.println(getAverageSalary(new double[] {100.00, 200.00, 300.00}));
        System.out.println(getAverageSalary(new double[0]));
    }

    public static double getAverageSalary(double[] salaries) {
        return salaries.length == 0 ? 0.00 :
               salaries.length == 1 ? salaries[0] :
               Arrays.stream(salaries).reduce(0, (a, b) -> a + b) / salaries.length;
    }
}