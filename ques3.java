public class ques3 {
    public static void main(String[] args) {
        // Using lambda expression to create and run a thread
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread execution: " + i);
                try {
                    Thread.sleep(1000);  // Pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();  // Start the thread
    }
}

