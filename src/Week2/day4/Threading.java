package Week2.day4;
// Thread => Threads allows a program to operate more efficiently by doing multiple things at the same time.
           //Threads can be used to perform complicated tasks in the background without interrupting the main program.
// Synchronized Thread =>
// Non Synchronized Thread =>

public class Threading {
    public static void main(String[] args) {
        PrintOdd threadOdd = new PrintOdd();
        PrintEven threadEven = new PrintEven();

        /*
        //First finishes the threads, then finishes the main.
        threadOdd.run(); //-> This one runs first, asynchronously then other
        threadEven.run(); //-> Then this runs
        */

        // First finishes what's inside the main, then goes to threads and these are synchronous
        threadOdd.start();
        threadEven.start();

        System.out.println("Process is over.");

    }

    static class PrintOdd extends Thread{
        public void run() {
            for (int i = 1; i < 20; i = i + 2){
                System.out.println("Odd:"+i);
                try{
                    sleep(1000);
                } catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class PrintEven extends Thread{
        public void run() {
            for (int i = 0; i < 20; i = i + 2){
                System.out.println("Even:"+i);
                try{
                    sleep(1000);
                } catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
