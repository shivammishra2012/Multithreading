package sharedVariableCode;

public class sharedVariableCode {
    public static void main(String[] args) throws InterruptedException {
        NumberStore numberStore=new NumberStore();
        Thread t1=new Thread(new Worker(numberStore, "thread A"));
        Thread t2=new Thread(new Worker(numberStore, "Thread B"));
        Thread t3=new Thread(new Worker(numberStore, "Thread C"));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        // main thread will wait for both thread 1 and thread2 to complete its excecutionans below system.out statement will be printed

        System.out.println(numberStore.getX());

    }
}
