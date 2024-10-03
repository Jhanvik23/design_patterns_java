package Creational_Pattern.Factory_Pattern;

public class AccountFactoryTest {
    public static void main(String[] args) {
        Account savings = AccountFactory.getAccount("Savings");
        savings.accountType();

        Account current = AccountFactory.getAccount("Current");
        current.accountType();
    }
}

