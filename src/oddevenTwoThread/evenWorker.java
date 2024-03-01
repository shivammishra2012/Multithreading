package oddevenTwoThread;

public class evenWorker implements Runnable{
    private final String name;
    private final Object lock;



    public evenWorker(String name, Object lock){
        this.name=name;
        this.lock=lock;
    }
    @Override
    public void run() {

        while(true) {
            synchronized (lock) {
                if(oddEvenProgram.curr >oddEvenProgram.limit ){
                    break;
                    // break the loop
                }
                if (oddEvenProgram.curr % 2 == 0) {
                    System.out.println(name + " " + oddEvenProgram.curr);
                    oddEvenProgram.curr++;

                }
            }
        }

    }
}
