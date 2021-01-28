package lambda_programming;

import lambda_programming.data.Guitar;
import lambda_programming.data.GuitarDO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ComparatorApp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        Function<String, Integer> compareFunction = s -> s.length();
        Comparator<String> comparator =
                Comparator.comparing(compareFunction);
        list.sort(comparator);
        System.out.println(list);

        GuitarDO guitarOne = new GuitarDO("Les Paul", "1200");
        GuitarDO guitarTwo = new GuitarDO("Fender Stratocaster", "1000");
        GuitarDO guitarThree = new GuitarDO("Ibanez", "2000");
        GuitarDO guitarFour = new GuitarDO("Martin", "3400");
        List<GuitarDO> guitars = Arrays.asList(guitarOne, guitarTwo, guitarThree, guitarFour);

        Comparator<GuitarDO> compareCost = Comparator.comparing(GuitarDO::getCost);
        Comparator<GuitarDO> compareType = Comparator.comparing(GuitarDO::getType);
        Comparator<GuitarDO> compare = compareCost.thenComparing(compareType);
        Comparator<GuitarDO> reversed = compare.reversed();

        guitars.sort(compareCost);
        System.out.println("\nComparing cost:");
        guitars.forEach(guitar -> System.out.println(guitar.getType() + " " + guitar.getCost()));

        guitars.sort(compareType);
        System.out.println("\nComparing type:");
        guitars.forEach(guitar -> System.out.println(guitar.getType() + " " + guitar.getCost()));

        guitars.sort(compare);
        System.out.println("\nComparing cost and type:");
        guitars.forEach(guitar -> System.out.println(guitar.getType() + " " + guitar.getCost()));

        guitars.sort(reversed);
        System.out.println("\nReversed listing:");
        guitars.forEach(guitar -> System.out.println(guitar.getType() + " " + guitar.getCost()));

    }
}
