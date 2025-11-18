import java.util.*;

/*
    Decorator pattern is used to provide new behaviour/ changing behaviour of methods in the class w/o modifying the classes. Create a wrapper around the existing classes that implements the same interface
    The decorator class has composition as well as inheritance with the common interface
 */

void main() {

    Coffee espresso = new Espresso();

    Coffee coffeeDecorator = new CoffeeDecorator(espresso);

    Coffee milkDecorator = new MilkDecorator(coffeeDecorator);

    Coffee sugarDecorator = new SugarDecorator(milkDecorator);

    System.out.println(sugarDecorator.description());
    System.out.println(sugarDecorator.price());
}
