// lowlevel/SwallowedException.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SwallowedException {
    public static void main(String[] args)
            throws InterruptedException {
        ExecutorService exec =
                Executors.newSingleThreadExecutor();
        exec.submit(() -> {
            throw new RuntimeException();
        });
        exec.shutdown();
    }
}
