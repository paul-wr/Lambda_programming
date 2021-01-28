package lambda_programming;

import lambda_programming.data.Guitar;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdasApp {
    public static void main(String[] args) {
        Guitar<List> guitar = () -> Arrays.asList(1,2,3,4,5);

        System.out.println(guitar.getType());

        Guitar<String> guitarTwo = () -> "Les Paul";

        System.out.println(guitarTwo.getType());

        Guitar<Boolean> guitarThree = () -> true;

        System.out.println(guitarThree.getType());

        // if more then one line of code, use curly brackets and explicit return keyword
        Supplier<String> supplier = () -> {
            System.out.println("This is the Supplier interface");
            return "Return string in Supplier";
        };
        System.out.println(supplier.get());

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("testing consumer interface");

        Consumer<String> consumerTwo = (s) -> {
            System.out.println("Printing from inside the second Consumer interface");
            System.out.println(s);
        };

        consumerTwo.accept("testing second consumer interface");
    }
}
