public class ThreadDemo {
 
    public static void main ( String args[]) {
           Thread t = new Thread();
    System.out.println("Thread is Running ");
    
    // When we call t.run(), it executes in the current (main) thread
    // No new thread is created - it's just a regular method call
    t.run();

    // When we call t.start(), JVM makes a native call to OS
    // OS creates a new thread with its own stack and registers it with the scheduler
    // The new thread automatically calls run() method asynchronously
    // Meanwhile, the main thread continues immediately to the next line
    // without waiting for the new thread to finish
    t.start();

    }

}
