public class SugarDecorator extends CoffeeDecorator {

    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return this.coffee.description() + " sugar";
    }

    @Override
    public int price() {
        return this.coffee.price() + 3;
    }
}
