package day40_exception.bank;

public class C10_UserAccount {
    public static void main(String[] args) {
        C9_Bank accountOne = new C9_Bank();
        accountOne.balance = 1000;

        accountOne.withdraw(9000);

        System.out.println("-----------");

        try {
            accountOne.login("Test", "0000");
        } catch (C12_InvalidCredentialException e)  {
            System.out.println(e.getMessage());
        }

        System.out.println("End");


    }
}