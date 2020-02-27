package cc.xpbootcamp.code_smell_kit.$07_divergent_change;

public class Customer {

    protected String name;
    protected String email;
    protected Account account;

    Customer(final String name, final String email, final Account account) {
        this.name = name;
        this.email = email;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}