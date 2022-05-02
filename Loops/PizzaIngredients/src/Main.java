public class Main {
    public static void main(String[] args) {
        String[] pizzaIngredients = {"Cheese", "Tomato", "Potato", "Chicken", "Beckon"};

        for(String value: pizzaIngredients) {
            System.out.printf("I bought some yummy %s for my pizza!\n", value);
        }
    }
}