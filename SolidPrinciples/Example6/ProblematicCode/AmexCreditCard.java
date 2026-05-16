package SolidPrinciples.Example6.ProblematicCode;

public class AmexCreditCard extends CreditCard {
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
        // Amex cards may not support tap and pay, but we are forced to implement it
        throw new UnsupportedOperationException("Tap and Pay not supported by Amex Credit Card");
    }

    @Override
    public void upiPayment() {
        // Amex cards may not support UPI payments, but we are forced to implement it
        throw new UnsupportedOperationException("UPI Payment not supported by Amex Credit Card");
    }

}
