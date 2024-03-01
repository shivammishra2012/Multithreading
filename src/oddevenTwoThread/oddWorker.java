package oddevenTwoThread;

public class oddWorker implements Runnable{
    private final String name;
    private final Object lock;



    public oddWorker(String name, Object lock){
        this.name=name;
        this.lock=lock;
    }

//note:-> Compound actions should be guarded inside a lock

    @Override
    public void run() {
        while(true) {
            synchronized (lock) {
                if(oddEvenProgram.curr >oddEvenProgram.limit ){
                    break;
                }
                if (oddEvenProgram.curr % 2 != 0) {
                    System.out.println(name + " " + oddEvenProgram.curr);
                    oddEvenProgram.curr++;

                }
            }
        }

    }
}
