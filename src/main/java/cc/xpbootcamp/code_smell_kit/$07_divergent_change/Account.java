package cc.xpbootcamp.code_smell_kit.$07_divergent_change;

public class Account {
    private AccountType type;

    private int daysOverdrawn;

    private Money money;

    private Customer customer;

    public Account(final AccountType type, final int daysOverdrawn) {
        super();
        this.type = type;
        this.daysOverdrawn = daysOverdrawn;
    }

    // divergent change
    public double bankcharge() {
        double result = 4.5;

        result += overdraftCharge();

        return result;
    }

    private double overdraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (getDaysOverdrawn() > 7) {
                result += (getDaysOverdrawn() - 7) * 1.0;
            }

            return result;
        } else {
            return getDaysOverdrawn() * 1.75;
        }
    }

    public int getDaysOverdrawn() {
        return daysOverdrawn;
    }

    public void setMoney(final Money money) {
        this.money = money;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public AccountType getType() {
        return type;
    }
}