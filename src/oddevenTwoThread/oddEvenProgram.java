package oddevenTwoThread;

public class oddEvenProgram {
    public static final int limit=20;
    public static int curr=1;
    public static void main(String[] args) {
        Object obj=new Object();
        Thread t1=new Thread(new oddWorker("odd-1",obj));
        Thread t2=new Thread(new evenWorker("even-1",obj));
        Thread t3=new Thread(new oddWorker("odd-2",obj));
        Thread t4=new Thread(new evenWorker("even-2",obj));
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }

}
