package lambda_programming;

import java.util.function.Consumer;

public class ChainingLambda {
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println("c1 consumes " + s);
        Consumer<String> c2 = (s) -> System.out.println("c2 consumes " + s);

        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("Hello");
    }
}
