package CompletionStagePluralsight;


import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> Thread.currentThread().getName();

        CompletableFuture<String> completedFuture = CompletableFuture.supplyAsync(supplier);

        String string = completedFuture.join();  // Blocking call. If not used then Main thread will be finished

        System.out.println("Result" + string);


    }
}
