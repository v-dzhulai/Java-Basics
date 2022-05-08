public class Main {
    public static void main(String[] args) {
        System.out.println(isWerewolf("rotator"));
        System.out.println(isWerewolf("home"));
    }

    public static boolean isWerewolf(String target) {
        StringBuilder str = new StringBuilder().append(target);
        return target.equals(str.reverse().toString());
    }
}