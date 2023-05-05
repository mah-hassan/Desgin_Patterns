import PaymentMethodes.PayByCreditCard;
import PaymentMethodes.PayByPayPal;

public class GYM {
    public static void main(String[] args) {
        System.out.println("welcome to our GYM");
        Subscription subscribe = new Subscription(3,true);
        PayByPayPal myPayPal = new PayByPayPal();
        PayByCreditCard myCreditCard = new PayByCreditCard();
        PaymentService paymentService = new PaymentService(subscribe, myPayPal,10,10);
        paymentService.applyPayment();
        System.out.println("********************************************");
        paymentService.setMethod(myCreditCard);
        paymentService.applyPayment();

    }
}
