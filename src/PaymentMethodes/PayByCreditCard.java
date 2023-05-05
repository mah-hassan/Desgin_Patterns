package PaymentMethodes;
import PaymentMethodes.PaymentMethod;
import java.util.Scanner;
public class PayByCreditCard implements PaymentMethod {
    private String CardNumber;
    private String cvv;
    private String date;
    private boolean valid = false;
    Scanner input = new Scanner(System.in);

    public void setCardNumber() {
        System.out.println("Please enter you CreditCard Number : ");
        this.CardNumber = input.nextLine();
    }

    public void setCvv() {
        System.out.println("Please enter you CreditCard cvv Number : ");
        this.cvv = input.nextLine();
    }

    public void setDate() {
        System.out.println("Please enter you CreditCard expiration date : ");
        this.date = input.nextLine();
    }

    public void collectPaymentDetails(){
        setCardNumber();
        setCvv();
        setDate();
        System.out.println("CreditCard information has been collected");
    };

   public boolean validatePaymentDetails(){
       if (this.CardNumber.matches("[0-9]{16}") && this.cvv.matches("[0-9]{3}")){
           System.out.println("card info is valid ");
           valid = true;
       }else System.out.println("card info is not valid ");

       return valid;
    };

   public void pay(int amount){
       System.out.println("you have paid " + amount + "$ from this CreditCard " + CardNumber);
   };

}
