package sharedVariableCode;

public class sharedVariableCode {
    public static void main(String[] args) throws InterruptedException {
        NumberStore numberStore=new NumberStore();
        Thread t1=new Thread(new Worker(numberStore));
        Thread t2=new Thread(new Worker(numberStore));
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // main thread will wait for both thread 1 and thread2 to complete its excecution.

        System.out.println(numberStore.getX());

    }
}
