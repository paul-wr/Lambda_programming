package lambda_programming;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> p = Predicate.isEqual("abcd");
        System.out.println("p.test() = " + p.test("abcd"));

        Predicate<Integer> greaterThanFifty = (Integer i) -> i > 50;
        Predicate<Integer> lessThanSeventy = (Integer i) -> i < 70;

        System.out.printf("i > 50 && < 70 = %b%n", greaterThanFifty.and(lessThanSeventy).test(51));

        System.out.printf("i > 50 || < 70 = %b", greaterThanFifty.or(lessThanSeventy).test(21));

    }
}
