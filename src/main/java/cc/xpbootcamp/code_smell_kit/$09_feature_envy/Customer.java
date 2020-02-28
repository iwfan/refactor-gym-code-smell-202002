package cc.xpbootcamp.code_smell_kit.$09_feature_envy;

public class Customer {

    private Phone mobilePhone;

    // feature envy
    public String getMobilePhoneNumber() {
        return "(" +
                mobilePhone.getAreaCode() + ") " +
                mobilePhone.getPrefix() + "-" +
                mobilePhone.getNumber();
    }
}
