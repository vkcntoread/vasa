package dinner.interfaceTest;

public class Animal {
    private Soundable animal;

    int v = 20;

    public void whoIs() {
        System.out.println("It is animal");
    }

    public void ms() {
        animal.makeSound();
        new Leg();
    }

    public int gP ()
    {     return   animal.getPrice();
    }

    public void setAnimal(Soundable animal) {
        this.animal = animal;
    }


  public class Leg {
      Leg () {
          System.out.println(v);
          System.out.println("Leg");

      }
  }


}
