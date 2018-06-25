package dinner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Input digit"));
        System.out.println(a * 2);
        try {
            new F1().test();
        }
        catch (ArithmeticException e)
        { JOptionPane.showMessageDialog(null,"Division by 0"); }

    }
}
