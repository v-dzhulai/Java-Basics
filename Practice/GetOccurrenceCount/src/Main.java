public class Main {
    public static void main(String[] args) {
        System.out.println(getOccurrenceCount(new String[] {"blue", "blue", "blue"}, "blue"));
        System.out.println(getOccurrenceCount(new String[] {"blue", "green", "red"}, "red"));
        System.out.println(getOccurrenceCount(new String[] {"blue", "green", "red"}, "white"));
        System.out.println(getOccurrenceCount(new String[] {"blue", "green", "red"}, null));
        System.out.println(getOccurrenceCount(new String[0], "blue"));
    }

    public static int getOccurrenceCount(String[] colors, String targetColor) {
        int count = 0;
        for(String i : colors) if(i.equals(targetColor)) count++;
        return count;
    }
}