package udemy_course_java.basics;

import java.util.Scanner;

public class MethodsExample2 {
    /*
    Kullanicidan alinan 2 sayiin ebobunu bulma
    */
    public static int findEbob(int num1, int num2){
        int ebob = 1;

        for (int i = 1; i <= num1 && i <= num2; i++){
            if ((num1 % i == 0) && (num2 % i == 0)){
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Num2 : ");
        int num2 = scanner.nextInt();

        System.out.println("Ebob: "+findEbob(num1, num2));
    }

}
