public class MilkDecorator extends CoffeeDecorator {

    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return this.coffee.description() + " milk";
    }

    @Override
    public int price() {
        return this.coffee.price() + 5;
    }
}
