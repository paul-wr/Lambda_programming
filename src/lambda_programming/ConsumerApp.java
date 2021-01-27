package lambda_programming;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> c = (String s) -> System.out.printf("The Consumer interface arg is: %s%n", s);

        c.accept("test");
        c.accept("sample");
    }
}
