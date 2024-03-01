package secondDanger;

public class Worker implements Runnable {

    private final int number;
    private final Object lock;
    private int round;

    public Worker(int number, Object lock, int round) {
        this.number = number;
        this.lock = lock;
        this.round = round;
    }

    // to print numbers from 1 to 10 in sorted orders->done

    // to print numbers from 1 to 10 in 3 rounds->done
    // Each thread stack has its own memory in below case
    // Thread switching can happen at anytime

    @Override
    public void run() {
        while (this.round > 0) {
            while (/*this.number > SortNumbers.curr*/compare()) {



                    //Thread.sleep(200);


            }


            if (this.number == SortNumbers.curr) {
                System.out.println(this.number);
                synchronized (lock) {
                    //System.out.println(this.number);
                    //SortNumbers.curr++;
                    SortNumbers.curr = (SortNumbers.curr + 1) % 11;
                    if (SortNumbers.curr == 0) {
                        SortNumbers.curr = 1;
                    }


                }
            }

                this.round--;



        }

    }
    private boolean compare () {
        boolean ans = false;
        synchronized (lock) {
            ans = !(this.number == SortNumbers.curr);
        }
        return ans;
    }
}











