package learn.java;

/**
 * Method Override
 */
public class App {
    public static void main(String[] args) {
        BMW bmw = new BMW(10);
        bmw.brake();
        System.out.println(bmw.toString());
    }
}