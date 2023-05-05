package PaymentMethodes;
import java.util.Scanner;
import PaymentMethodes.PaymentMethod;
public class PayByPayPal implements PaymentMethod{
    private String Email;
    private String Password;
    private boolean valid = false;
    Scanner input = new Scanner(System.in);
    public void setEmail() {
        System.out.println("Please enter you PayPal Email : ");
        this.Email = input.nextLine();
    }

    public void setPassword() {
        System.out.println("Please enter you PayPal account password : ");
        this.Password = input.nextLine();
    }

    public void collectPaymentDetails(){
        setEmail();
        setPassword();
        System.out.println("PayPal account information has been collected ");
    };

    public boolean validatePaymentDetails(){

        if (this.Email.contains("@")) {
            System.out.println("PayPal account information is correct ");
            valid = true;
        }else System.out.println("PayPal account information is not correct ");

        return valid;
    };

    public void pay(int amount){
        System.out.println("you have paid " + amount + "$ from this PayPal account " + Email);
    };

}
