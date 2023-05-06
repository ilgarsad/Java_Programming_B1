package day07_relational_operators;

public class C2_SalaryCalculator {

    /*
    add a main method
    declare and assign these variables:

    salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample date:
            100000 (salary)
            0.08 (state tax rate)
            0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes

     */

    public static void main(String[] args) {

        double salary = 100_000,
                stateTaxRate = 0.08,
                federalTaxRate = 0.21,
                stateTax,
                federalTax,
                totalTax,
                salaryAfterTax;

        stateTax = salary * stateTaxRate;   // %8
        federalTax = salary * federalTaxRate;

        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        System.out.println("State Tax Rate: " + stateTaxRate + "\nFederal Tax Rate: " + federalTaxRate + "\nBase Salary: " + salary + "\nTotal Tax Amount: $" + totalTax + "\nThe Salary After Tax: $" + salaryAfterTax);

        System.out.println();

        String message = "State Tax Rate: " + stateTaxRate + "\nFederal Tax Rate: " + federalTaxRate + "\nBase Salary: " + salary + "\nTotal Tax Amount: $" + totalTax + "\nThe Salary After Tax: $" + salaryAfterTax;
        System.out.println(message);


    }
}
