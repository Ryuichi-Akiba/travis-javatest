package org.majimena;

/**
 * Created by akiba on 4/30/15.
 */
public class App {

    public static void main(String... args) {
        App app = new App();
        System.out.println(app.greet(args[0]));
    }

    public String greet(final String message) {

        if (message != null) {
            return "Hello, " + message;
        }
        return "Hello, World!!";
    }
}
