import PaymentMethodes.PaymentMethod;
public class PaymentService {

    private int cost;
    private int NutritionalCareCost;
    private Subscription subscribe;
    private PaymentMethod Method;

    public PaymentService(Subscription subscribe , PaymentMethod Method,int cost ,int NutritionalCareCost ){
        this.subscribe = subscribe;
        this.Method = Method;
        this.cost = cost;
        if (this.subscribe.isNutritionalCare()) this.NutritionalCareCost = NutritionalCareCost;

    }
    public void applyPayment() {
        Method.collectPaymentDetails();
        if (Method.validatePaymentDetails()) {
            Method.pay(getTotal());
            subscribe.ToString();
        }else System.out.println("Verify payment information");
    }

    public PaymentService(){
        this.cost = 0;
        this.NutritionalCareCost = 0;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMethod(PaymentMethod method) {
        this.Method = method;
    }


    private int getTotal() {
        return subscribe.isNutritionalCare() ? cost*subscribe.getNomOfMonths() + NutritionalCareCost* subscribe.getNomOfMonths() : cost* subscribe.getNomOfMonths();
    }
    public void setSubscribe(Subscription subscribe) {
        this.subscribe = subscribe;
    }

}

