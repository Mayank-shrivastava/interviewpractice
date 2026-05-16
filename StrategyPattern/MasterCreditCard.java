package StrategyPattern;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    // composition - has a relationship with RefundStrategy
    // dependecy inversion principle comes into play here as 
    // MasterCreditCard is depending on abstraction (RefundStrategy) 
    // rather than concrete implementation (BankRefundStrategy or SameInstrumentRefundStrategy)

    // Simple definition of dependency inversion principle is that high level modules 
    // should not depend on low level modules, both should depend on abstractions. 
    // In this case, MasterCreditCard is a high level module and BankRefundStrategy or 
    // SameInstrumentRefundStrategy are low level modules. By depending on the abstraction (RefundStrategy), 
    // MasterCreditCard can work with any refund strategy without needing to change its code, thus adhering 
    // to the Open/Closed Principle as well.
    // private RefundStrategy refundStrategy;
    // public MasterCreditCard() {
    //     this.refundStrategy = new BankRefundStrategy();
    // }

    // Dependency Injection - we can inject the refund strategy from outside, making it more flexible and testable

    private RefundStrategy refundStrategy;
    public MasterCreditCard(RefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
    }

    @Override
    public void doRefund() {
        this.refundStrategy.doRefund();
    }

}
