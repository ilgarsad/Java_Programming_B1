package day40_exception.bank;

public class C11_NotEnoughMoneyException extends RuntimeException {

    // This is unchecked / runtime exception since it inherits the RuntimeException class
    public C11_NotEnoughMoneyException() {
        super("Not enough money");
    }


    public C11_NotEnoughMoneyException(String msg) {
        super(msg);
    }
}