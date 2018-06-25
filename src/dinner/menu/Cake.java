package dinner.menu;

public class Cake extends Food {

    public Cake(String name, int price) {
        super(name, price);
    }

    @Override
    public void print() {
        System.out.println(price);
    }

    public void method  ()
{
    System.out.println("!!!!!!");
}

}


