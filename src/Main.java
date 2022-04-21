public class Main{
    // when the class is public, the name of the file has to be the class name
    public static void main(String[] args) {
        // create a program generates random int range 10-100
        // Random random = new Random();
        // int result = random.nextInt(90) + 10;
        // System.out.println("Random number(10-100): "+result);
//        int x = 5;
//        int y = x--;
//        int z = --x;
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        for (int i=0; i<2; ++i){
//            System.out.println(i);
//        }
        int[] numbers = {1,2,3,4,5,6,23,8,9,10};
        int maximum = numbers[0];
        int minimum = numbers[0];
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            else if (numbers[i] < minimum){
                minimum = numbers[i];
            }
        }
        System.out.println("Max: "+maximum);
        System.out.println("Min: "+minimum);
    }
}