package multithreading;

public class Main {

    static class ExtraThread2 implements Runnable{

        public void run() {

        }
    }

    static class ExtraThread extends Thread{

        public void run(){ //This behaves like a main function and runs at the start of the creation of thread.

//            while(1>0){
//                System.out.println("I am in the Extra thread created");
//            }


        }

    }

    public static void main(String[] args) throws InterruptedException {


        //This is a thread going on....


        Thread t2  = new Thread(new ExtraThread2());
        t2.start();



        //Creating a new Thread
        ExtraThread newThread = new ExtraThread();
        newThread.start();



        try {
            ///while(1>0){
                Thread.sleep(5000);
                int a = 3;
                while(a>0) {
                    System.out.println("I am in the main statement");
                    a--;
                }
                System.out.println("Sleeeping for 5 seconds");



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        newThread.getName();

        boolean isAlive = newThread.isAlive();

        int priority = newThread.getPriority();

        newThread.join();

    }
}
