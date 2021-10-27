package creational_design_pattern.factory_method.java_demo;

import java.util.Scanner;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();

        System.out.println("Please Choose Payment Method:");
        System.out.println("1. Stripe Payment");
        System.out.println("2. Razor Pay");
        System.out.println("3. Xyz Payment");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                Payment stripePayment = paymentFactory.getPayment("stripe");
                stripePayment.getCurrency();
                stripePayment.checkout();
                break;
            case 2:
                Payment razorPayment = paymentFactory.getPayment("razor");
                razorPayment.getCurrency();
                razorPayment.checkout();
                break;
            case 3:
                Payment xyzPayment = paymentFactory.getPayment("xyz");
                xyzPayment.getCurrency();
                xyzPayment.checkout();
                break;
            default:
                System.out.println("Payment method not supported");
                System.exit(1);
                break;
        }

        in.close();

    }
}
