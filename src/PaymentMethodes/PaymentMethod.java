package PaymentMethodes;
public interface PaymentMethod {
    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);
}
