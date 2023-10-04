class MyThread  extends Thread{

    @Override
    public void run() {
        for (int i=0; i <= 100; i++) {
            System.out.print("T");
        }
    }
}

class MyTask implements Runnable {

    @Override
    public void run() {
        for (int i=0; i <= 100; i++) {
            System.out.print("-");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Thread thr = new MyThread();
        thr.start();

        Thread mytask = new Thread(new MyTask());
        mytask.start();

        for (int i=0; i <= 100; i++) {
            System.out.print("M");
        }

    }
}