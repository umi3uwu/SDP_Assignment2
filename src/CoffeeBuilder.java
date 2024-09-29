public class CoffeeBuilder {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;
    private Additive additive;

    public CoffeeBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeBuilder setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeBuilder setSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeBuilder setAdditive(Additive additive) {
        this.additive = additive;
        return this;
    }

    public Order build() {
        return new Order(coffee, milk, syrup, additive);
    }
}