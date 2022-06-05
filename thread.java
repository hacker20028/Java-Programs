//Write 3 different threads counting from 1 to 100, 101 to 200 and 201 to 300 and start them together Give them different priorities.
public class thread {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(i);
                }
            }
        });
        th1.setPriority(Thread.MIN_PRIORITY);
        th1.start();

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 101; i <= 200; i++) {
                    System.out.println(i);
                }
            }
        });
        th2.setPriority(Thread.MAX_PRIORITY);
        th2.start();

        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 201; i <= 300; i++) {
                    System.out.println(i);
                }
            }
        });
        th3.setPriority(Thread.NORM_PRIORITY);
        th3.start();
    }
    
}
