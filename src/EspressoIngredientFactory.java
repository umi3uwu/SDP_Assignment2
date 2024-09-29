public class EspressoIngredientFactory implements IngredientFactory {
    @Override
    public Milk createMilk() {
        return new WholeMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }

    @Override
    public Additive createAdditive() {
        return new ChocolateAdditive();
    }
}