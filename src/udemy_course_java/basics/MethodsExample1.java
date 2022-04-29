package udemy_course_java.basics;

public class MethodsExample1 {
    /*
    1'den 1000'e kadar olan sayilardan asal olanlari ekrana yazdirin
    */
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 2; i < 1000; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
