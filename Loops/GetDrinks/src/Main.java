public class Main {
    public static void main(String[] args) {
        int guestNumber = 5;
        int drinks      = 0;

        for(int i = 1; i < guestNumber + 1; i++) {
            drinks += i;
        }

        System.out.println("We have prepared " + drinks + " drinks!");
    }
}