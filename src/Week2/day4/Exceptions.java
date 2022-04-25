package Week2.day4;

public class Exceptions {
    public static void main(String[] args) {
        /*
        Exceptions
        1. Checked (At Time of Compilation)
        2. Unchecked (Runtime)
        3. Error ()
         */
        String[] testArray = {"a", "b", "c"};

        try {
            System.out.println(testArray[2]);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally we print this");
        }

    }
}
