package creational_design_pattern.factory_method.java_demo;

public abstract class Payment {

    protected String currency = "USD";

    /**
     * return the currency
     */
    abstract void getCurrency();

    /**
     * make checkout request
     */
    abstract void checkout();
}
