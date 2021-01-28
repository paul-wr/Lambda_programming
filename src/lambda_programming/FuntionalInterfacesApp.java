package lambda_programming;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class FuntionalInterfacesApp {
    public static void main(String[] args) {
        IntSupplier supplier = () -> 110;

        int i = supplier.getAsInt();
        System.out.println(i);

        // provide implementation of interface
        DoubleToIntFunction function = (num) -> (int) Math.floor(num);
        // call the method that was defined above
        int result = function.applyAsInt(Math.PI);
        System.out.println("Result: " + result);
    }
}
