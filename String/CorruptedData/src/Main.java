public class Main {
    public static void main(String[] args) {
        System.out.println(getValue("name=joHN"));
    }

    public static String getValue(String dataFromDatabase) {
        int index = dataFromDatabase.indexOf('=');
        return dataFromDatabase.substring(index + 1).toLowerCase();
    }
}