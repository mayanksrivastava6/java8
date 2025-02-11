public class ques3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread execution: " + i);
                try {
                    Thread.sleep(1000);  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start(); 
    }
}

