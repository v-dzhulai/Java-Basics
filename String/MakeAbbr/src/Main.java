public class Main {
    public static void main(String[] args) {
        System.out.println(makeAbbr("national aeronautics space administration"));
    }

    public static String makeAbbr(String fullName) {
        StringBuilder newName = new StringBuilder();
        String[]      words   = fullName.split(" ");

        for(String i : words) newName.append(i.charAt(0));

        return newName.toString().toUpperCase();
    }
}