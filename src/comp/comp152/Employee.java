package comp.comp152;

public abstract class Employee {

    public void fileW2Forms(){
        System.out.println("Here are your W2 tax forms: ");
    }

    public void WithholdTaxes(){
        System.out.println("Removing " + calculateBiWeeklyPay()*.1 + " of your pay for taxes");
    }

    public abstract double calculateBiWeeklyPay();
}
