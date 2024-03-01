package sharedVariableCode;

public class NumberStore {
    // this is shared class among various threads
    private volatile int x;

    private Object object;

    public NumberStore()
    {
        this.x=0;
        this.object=new Object();

    }
    public synchronized void increment()
    {
       /* synchronized (object)
        {
           x++;
        }*/
        /*synchronized (this)
        {
            x++;
        }*/
        System.out.println(x);
        x++;
        //System.out.println(Thread.currentThread().getName());

        // 3-step process
        //1.fetch i
        //2.perform x+1;
        //3 write updated value again to x
        // critical section-piece of code which will create indulge in race conditions
        //when multiple threads doing increment operation they can fetch same value and update it to same result which is not the expected intention
        //context switching is the main issue that leads to race conditions we need to design thread safe code

        // here we create additional object and then acquire lock to prevent it from race condition
        // But here is the catch we can also use this inside synchronized as this refers to current instance of numberstore through which increment method is called
        // If we make increment method synchronized it will do same things
        // atomic means we are safe guarding the critical sections of code among multiple thread to execute sequentially.


        // ˀ



    }
    public synchronized int getX()
    {
        return x;
    }






}
