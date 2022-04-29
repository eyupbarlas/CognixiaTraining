package udemy_course_java.basics.oop_examples;

public class Account_ATM_Example {
    private String username;
    private String password;
    private int balance;

    public Account_ATM_Example(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(int amount){
        if (amount > balance){
            System.out.println("Balance insufficient");
        }
        else {
            balance -= amount;
            System.out.println("New Balance: " + balance);
        }
    }


}
