public class Main {
    public static void main(String[] args) {
        System.out.println(getSuccessRate("11100"));
    }

    public static double getSuccessRate(String statistic) {
        if(statistic.isEmpty()) return 0.0;
        double count = 0.0;
        char[] statisticArr = statistic.toCharArray();
        for(char i : statisticArr) if(i == '1') count++;

        return count / statisticArr.length;
    }
}