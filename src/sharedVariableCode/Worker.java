package sharedVariableCode;

public class Worker implements Runnable{

    private final NumberStore numberStore;
    private final String name;

    public Worker(NumberStore numberStore, String name) {
        this.numberStore = numberStore;
        this.name = name;
    }

    @Override
    public void run() {

        for(int i=0;i<10;i++)
        {
            System.out.println(name +":"+numberStore.getX()+Thread.currentThread().getName());

            numberStore.increment();
            /*try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            //if you print multiple thread reads the same value as before operating the increment operations threads switching happen as a result getx() for many threads print the same value

        }

    }
}
