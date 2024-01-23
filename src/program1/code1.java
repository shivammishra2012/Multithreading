package program1;

public class code1 {
    public static void main(String[] args) {
        System.out.println("starting main");
        Thread t1=new Thread(new Sequencer());
        Thread t2=new Thread(new ReverseSequencer());
        t1.start();
        t2.start();
        for(int i=100;i<110;i++){
            System.out.print(i + " ");
        }

    }
}
