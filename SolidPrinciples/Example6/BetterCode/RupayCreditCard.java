package SolidPrinciples.Example6.BetterCode;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard, RefundCompatibleCreditCard {
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
    }
}
