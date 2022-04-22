package Week1.day2;

import java.util.Stack;

public class stacks {
    public static boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>(); // Stack object

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i); // getting every character
            if(ch=='(' || ch== '[' || ch=='{'){ // if it is a beginning condition push to stack
                stack1.push(ch);
            }
            // conditions when it should be false
            else if(stack1.isEmpty()==true){
                return false;
            }
            else if(ch==')' && stack1.pop()!='('){
                return false;
            }
            else if(ch==']' && stack1.pop()!='['){
                return false;
            }
            else if(ch=='}' && stack1.pop()!='{'){
                return false;
            }
        }
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        String test = "(){}[";
        System.out.println("Validity: "+isValid(test));
    }
}
