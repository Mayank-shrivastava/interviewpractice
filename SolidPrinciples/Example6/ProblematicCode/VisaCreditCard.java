package SolidPrinciples.Example6.ProblematicCode;

public class VisaCreditCard extends CreditCard {
    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void doRefund() {
        // Implementation for refund
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

    @Override
    public void tapAndPay() {
        // Visa cards may not support tap and pay, but we are forced to implement it
        throw new UnsupportedOperationException("Tap and Pay not supported by Visa Credit Card");
    }

    @Override
    public void upiPayment() {
        // Visa cards may not support UPI payments, but we are forced to implement it
        throw new UnsupportedOperationException("UPI Payment not supported by Visa Credit Card");
    }

}
