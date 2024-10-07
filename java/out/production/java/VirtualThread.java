package out.production.java;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThread {


    public static void main(String[] args) throws InterruptedException {

        // first way  Using the Thread Class and the Thread.Builder Interface to Create a Virtual Thread

        // Initialization of thread
        Thread.Builder builder = Thread.ofVirtual().name("iamthatsoftwareguy");

        Runnable task = () -> {
            System.out.println("running");
        };

        Thread t = builder.start(task);

        System.out.println("thread t name: " + t.getName());

        // Add a delay to allow the virtual thread to run
        // Sleep for 1 second
        Thread.sleep(1000);

        // Wait for the thread to complete
        t.join();


        //2. Creating and executing a virtual thread with the Executors.newVirtualThreadPerTaskExecutor() Method


       /* try (ExecutorService myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            // Submit a task that prints a message
            Future<?> future = myExecutor.submit(() -> System.out.println("Running thread"));

            // Wait for the task to complete
            future.get();

            System.out.println("end !!");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }*/
    }

}
