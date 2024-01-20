public class Main {
    public static void main(Stirng[] args) {
        Account account = new Account(); // başına Account yerine "var" diyrbilirsin
        // "account.balanace = 1" eğer balance public olsaydı değeri bu şekilde değiştirebilirdim
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}

public class Account {
    // private/public are access modifiers 
    private float balance;

    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            balance -= amount;
    }

    public float getBalance() {
        return balance;
    }
}