public class threadDemo {
    public static void main(String args[]){
        Thread th = Thread.currentThread();
        System.out.println("Current Thread is: " + th);

        th.setName("MY Thread");
        System.out.println("After changing name of thread: " + th);
    }
}
