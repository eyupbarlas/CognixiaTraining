package Week2.day4;

public class Threading1 {
        static int i = 1;
        public static void main(String[] args) {
            PrintOdd printOdd = new PrintOdd();
            PrintEven printEven = new PrintEven();


            printOdd.start();
            printEven.start();

        }

        static class PrintOdd extends Thread {
            public void run() {
                while(i<=20) {
                    if(i%2==1) {
                        System.out.println(i);
                        i++;
                    }
                }
            }
        }

        static class PrintEven extends Thread {
            public void run() {
                while(i<=20) {
                    if(i%2==0) {
                        System.out.println(i);
                        i++;
                    }
                }
            }
        }

}
