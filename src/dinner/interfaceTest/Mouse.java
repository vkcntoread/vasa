package dinner.interfaceTest;

public class Mouse implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("pi");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
