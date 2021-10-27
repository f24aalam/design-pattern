package creational_design_pattern.factory_method.java_demo;

public class StripePayment extends Payment {

    @Override
    void getCurrency() {
        System.out.println("Stripe Currency: " + currency);
    }

    @Override
    void checkout() {
        System.out.println("Stripe Checkout");
    }
    
}
