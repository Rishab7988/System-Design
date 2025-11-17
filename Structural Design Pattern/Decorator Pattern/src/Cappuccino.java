public class Cappuccino implements Coffee{

    @Override
    public String description() {
        return "Cappuccino";
    }

    @Override
    public int price() {
        return 20;
    }
}
