package dinner.interfaceTest;

public class Cat implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("Myay");
    }

    @Override
    public int getPrice() {
        return 5_000;
    }
}
