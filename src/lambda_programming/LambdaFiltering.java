package lambda_programming;

import lambda_programming.data.GuitarDO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFiltering {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one","two","three","four"));

        Predicate<String> filter = (s) -> !s.startsWith("t");

        list.removeIf(filter);

        list.forEach(System.out::println);
    }
}
