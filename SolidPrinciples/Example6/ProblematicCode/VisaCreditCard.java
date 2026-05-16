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
        System.out.println("Tap and Pay implemented here.")
    }

    @Override
    public void upiPayment() {
        System.out.println("upi payments implemented here.")
    }

}
