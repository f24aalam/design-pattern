package creational_design_pattern.factory_method.java_demo;

public class RazorPayment extends Payment{

    @Override
    void getCurrency() {
        System.out.println("Razor Currency: " + currency);
    }

    @Override
    void checkout() {
        System.out.println("Razor Checkout");
    }
}
