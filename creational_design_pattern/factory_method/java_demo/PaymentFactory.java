package creational_design_pattern.factory_method.java_demo;

public class PaymentFactory {
    public Payment getPayment(String payment) {

        if (payment.equalsIgnoreCase("STRIPE")) {
            return new StripePayment();
        }

        if (payment.equalsIgnoreCase("RAZOR")) {
            return new RazorPayment();
        }

        if (payment.equalsIgnoreCase("XYZ")) {
            return new XyzPayment();
        }

        return null;
    }
}
