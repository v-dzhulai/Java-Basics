public class Main {
    public static void main(String[] args) {
        int solutionAttempts = 0;
        int maximumAttempts  = 8;

        do {
            solutionAttempts++;
            System.out.printf("New solution is ready! %s\n", solutionAttempts);
        } while (solutionAttempts < maximumAttempts);
    }
}