package dinner.menu;


public class Food implements Printable {

    public Food() {
    }

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected String name;
    protected int price;


    @Override
    public void print() {
        System.out.println(name);
    }
}
