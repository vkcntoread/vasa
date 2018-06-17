package dinner;

/**
 *  Test is about
 */

public class Test {
    /**
     *  calculate the weight of cake
     */
    int[] a;

    void imp() {
        a = new int[2];
        try {
            arrayAction();
        } catch (Exception e) {
            System.out.println("Catched");
        }
        System.out.println("Done");
    }

    void arrayAction() throws Exception {
        a[2] = 0;
    }
}
