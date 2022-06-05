/* Write a java program to create and run following threads
 * 1) print "TMV" 10 times
 * 2) print "Welcome" 20 times
 */
public class anotheeThread {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("TMV");
                }
            }
        });
        th1.start();

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println("Welcome");
                }
            }
        });
        th2.start();
    }

}
