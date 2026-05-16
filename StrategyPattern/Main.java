package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        MasterCreditCard masterCreditCard = new MasterCreditCard(new SameInstrumentRefundStrategy());
        masterCreditCard.doRefund();
        // this is how dependency injection works, 
        // we can change the refund strategy without changing the credit card class
        // it changes behavior in the driver class not the implementation classes, thus adhering to the Open/Closed Principle as well.
    }

    // Dependency Injection: 
    // It involved techniques to supply dependencies of a class with their value at runtime.
    // Dependency injection can be done in mutiple ways, such as constructor injection, setter injection, 
    // or interface injection.

}
