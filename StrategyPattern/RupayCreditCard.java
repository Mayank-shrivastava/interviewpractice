package StrategyPattern;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard, RefundCompatibleCreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    private RefundStrategy refundStrategy;
    public RupayCreditCard() {
        this.refundStrategy = new SameInstrumentRefundStrategy();
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void upiPayment() {
        // Implementation for UPI payment
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
        // Implementation for refund
        this.refundStrategy.doRefund();
    }
}
