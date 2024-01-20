/*
 * Encapsulation - facilitates data hiding by making the internal state of an object private, 
 * and access to this state is controlled through public methods. 
*/

public class Main {
    public static void main(String[] args) {
        Account account = new Account(); // başına Account yerine "var" diyebilirsin
        // "account.balanace = 1" eğer balance public olsaydı değeri bu şekilde değiştirebilirdim
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}

public class Account {
    // private/public are access modifiers 
    private float balance; // balanace is just accessible within the Account class

    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            balance -= amount;
    }

    public float getBalance() { // for the main method to get the variable balanace
        return balance;
    }
}