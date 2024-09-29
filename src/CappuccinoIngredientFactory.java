public class CappuccinoIngredientFactory implements IngredientFactory {
    @Override
    public Milk createMilk() {
        return new AlmondMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new CaramelSyrup();
    }

    @Override
    public Additive createAdditive() {
        return new CinnamonAdditive();
    }
}