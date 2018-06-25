package dinner;

import dinner.interfaceTest.*;
import dinner.menu.Cake;
import dinner.menu.Drink;
import dinner.menu.Food;
import dinner.menu.Printable;

public class F1 {


    void test() throws ArithmeticException {
        //System.out.println(1/0);
        /*
        Food pizza = new Food("PIZZA1", 300);
        pizza.print();

        Cake c1=new Cake ("cake1", 550);
        ((Food) c1).print();
        c1.method();

        Printable thing = new Food("shashlik", 340);
        thing.print();
        thing = new Drink();
        thing.print();
*/
        Animal an1 = new Animal();



        Soundable m1 = new Mouse();
        an1.setAnimal(m1);
        an1.ms();
        //an1.whoIs();
        //System.out.println(an1.gP());


    }


}
