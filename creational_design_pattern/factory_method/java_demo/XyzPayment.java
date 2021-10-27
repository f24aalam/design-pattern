package creational_design_pattern.factory_method.java_demo;

public class XyzPayment extends Payment {

    @Override
    void getCurrency() {
        System.out.println("Xyz Currency: " + currency);
    }

    @Override
    void checkout() {
        System.out.println("xyz Checkout");
    }
    
}
