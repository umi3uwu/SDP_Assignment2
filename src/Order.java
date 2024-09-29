public class Order implements Cloneable {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;
    private Additive additive;

    public Order(Coffee coffee, Milk milk, Syrup syrup, Additive additive) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
        this.additive = additive;
    }


    @Override
    protected Order clone() throws CloneNotSupportedException {
        return (Order) super.clone();
    }

    @Override
    public String toString() {
        return coffee.getClass().getSimpleName() + " с " +
                milk.getMilk() + ", " + syrup.getSyrup() + ", добавка: " +
                additive.getAdditive();
    }
}