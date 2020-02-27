package cc.xpbootcamp.code_smell_kit.$07_divergent_change;

public class AccountType {
    private boolean premium;

    AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
}
