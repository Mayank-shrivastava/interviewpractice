package StrategyPattern;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    private RefundStrategy refundStrategy;
    public MasterCreditCard() {
        this.refundStrategy = new BankRefundStrategy();
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
