package lambda_programming;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> p = Predicate.isEqual("abcd");
        System.out.println("p.test() = " + p.test("abcd"));

        Predicate<Integer> greaterThanFifty = (i) -> i > 50;
        Predicate<Integer> lessThanSeventy = (i) -> i < 70;

        System.out.printf("i > 50 && < 70 = %b%n", greaterThanFifty.and(lessThanSeventy).test(51));

        System.out.printf("i > 50 || < 70 = %b%n", greaterThanFifty.or(lessThanSeventy).test(21));

        Predicate<String> isNull = (s) -> s == null;
        System.out.println("Testing null for nullable = " + isNull.test(null));
        System.out.println("Testing hello for nullable = " + isNull.test("hello"));

        Predicate<String> isEmpty = (s) -> s.isEmpty();
        System.out.println("Testing \"\" is empty = " + isEmpty.test(""));
        System.out.println("Testing hello is empty = " + isEmpty.test("hello"));

        Predicate<String> predicate = isNull.negate().and(isEmpty.negate());
        System.out.println(predicate.test("test"));
    }
}
