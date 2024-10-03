package Creational_Pattern.Factory_Pattern;

public class AccountFactory {
    public static Account getAccount(String type) {
        if ("Savings".equalsIgnoreCase(type)) {
            return new SavingsAccount();
        } else if ("Current".equalsIgnoreCase(type)) {
            return new CurrentAccount();
        }
        throw new IllegalArgumentException("Unknown account type: " + type);
    }
}
