package cc.xpbootcamp.code_smell_kit.$08_shotgun_surgery;

public class Account {
    private String type;
    private String accountNumber;
    private int amount;

    public Account(String type, String accountNumber, int amount) {
        this.amount = amount;
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public void debit(int debit) throws Exception {
        // shotgun surgery
        if (amount <= 500) {
            throw new Exception("Mininum balance shuold be over 500");
        }
        amount = amount - debit;
        System.out.println("Now amount is" + amount);
    }

    public void transfer(Account from, Account to, int cerditAmount) throws Exception {
        // shotgun surgery
        if (from.amount <= 500) {
            throw new Exception("Mininum balance shuold be over 500");
        }
        to.amount = amount + cerditAmount;
    }

    public void sendWarningMessage() {
        // shotgun surgery
        if (amount <= 500) {
            System.out.println("amount should be over 500");
        }
    }
}
