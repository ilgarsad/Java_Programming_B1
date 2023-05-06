package day32_custom_classes;

public class C2_Company {
    public static void main(String[] args) {

        C1_Employee emp1 = new C1_Employee("Parvana", "SDET");
        C1_Employee emp2 = new C1_Employee("Nazakat", 123, "QE", 125000.00);

        System.out.println(emp1);
        System.out.println("-----------------");
        System.out.println(emp2);
    }
}
