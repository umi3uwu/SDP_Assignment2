public class Main {
    public static void main(String[] args) {
        // Использование Singleton
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Использование Factory Method
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.prepare();

        // Использование Abstract Factory
        IngredientFactory espressoIngredients = new EspressoIngredientFactory();
        Milk milk = espressoIngredients.createMilk();
        Syrup syrup = espressoIngredients.createSyrup();
        Additive additive = espressoIngredients.createAdditive();

        // Использование Builder
        CoffeeBuilder builder = new CoffeeBuilder();
        Order order1 = builder.setCoffee(espresso)
                .setMilk(milk)
                .setSyrup(syrup)
                .setAdditive(additive)
                .build();

        coffeeShop.placeOrder(order1);

        // Использование Prototype
        try {
            Order order2 = order1.clone();
            coffeeShop.placeOrder(order2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
