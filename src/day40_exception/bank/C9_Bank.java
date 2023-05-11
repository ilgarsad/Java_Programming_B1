package day40_exception.bank;

public class C9_Bank {

    double balance;

    public void withdraw (double amountToTakeOut) {
        if (amountToTakeOut > balance) {
            throw new C11_NotEnoughMoneyException();
        }
    }



    public void login (String username, String password) throws C12_InvalidCredentialException {

        if (!username.equals("tomjerry")) {
            throw new C12_InvalidCredentialException("Not valid username");
        }

        if (!password.equals("0000")) {
            throw new C12_InvalidCredentialException("Not valid password");
        }

    }


}