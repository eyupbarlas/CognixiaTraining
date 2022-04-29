package Week2.day5;

public class Question2 {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,3,1,7,6,5};
        for(int i=0; i<test.length;i++){
            for (int j=i+1; j< test.length;j++){
                if (test[i] == test[j]){
                    System.out.print(test[j]+" ");
                }
            }
        }
    }
}
