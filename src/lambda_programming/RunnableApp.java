package lambda_programming;

public class RunnableApp {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running the run interface.");

        runnable.run();
    }
}
