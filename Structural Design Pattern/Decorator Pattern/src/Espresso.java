public class Espresso implements Coffee {
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public int price() {
        return 10;
    }

}
