public class CoffeeDecorator implements Coffee {

    Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return this.coffee.description();
    }

    @Override
    public int price() {
        return this.coffee.price();
    }
}
