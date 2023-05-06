package day33_a_static;

public class C4_BestBuyStores {
    public static void main(String[] args) {

        System.out.println(C3_BestBuy.headQuarters);
        System.out.println(C3_BestBuy.day);
        System.out.println(C3_BestBuy.numOfComputer);

        C3_BestBuy store1 = new C3_BestBuy("Fairfax");
        System.out.println(store1.location);
        System.out.println(store1.numOfComputer);

        store1.numOfComputer -= 10;
        System.out.println(store1.numOfComputer);

        C3_BestBuy store2 = new C3_BestBuy("Chantilly");
        System.out.println(store2.numOfComputer);
    }
}
