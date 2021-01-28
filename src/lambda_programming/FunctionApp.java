package lambda_programming;

import lambda_programming.data.GuitarDO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        GuitarDO guitarOne = new GuitarDO("Les Paul", "1200");
        GuitarDO guitarTwo = new GuitarDO("Fender Stratocaster", "1000");
        GuitarDO guitarThree = new GuitarDO("Ibanez", "2000");
        GuitarDO guitarFour = new GuitarDO("Martin", "3400");

        List<GuitarDO> guitars = List.of(guitarOne, guitarTwo, guitarThree, guitarFour);
        List<String> types = new ArrayList<>();
        Function<GuitarDO, String> guitarTypes = (guitarDO) -> guitarDO.getType();

        // using enhanced for loop
        /* for (GuitarDO guitarDO : guitars){
            String type = guitarTypes.apply(guitarDO);
            types.add(type);
        }*/

        // using forEach
        guitars.forEach(guitar -> {
            types.add(guitarTypes.apply(guitar));
        });

        types.forEach(type -> System.out.println(type));
    }
}
