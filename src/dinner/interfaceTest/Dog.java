package dinner.interfaceTest;

public class Dog implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("GAV");
    }

    @Override
    public int getPrice() {
        return 10_000;
    }
}
