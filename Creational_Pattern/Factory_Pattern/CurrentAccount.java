package Creational_Pattern.Factory_Pattern;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Current Account");
    }
}
