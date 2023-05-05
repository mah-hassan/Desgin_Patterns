public class Subscription {
    private int NomOfMonths = 0;
    private boolean NutritionalCare = false;

    public Subscription(int NomOfMonths , boolean NutritionalCare){
        this.NomOfMonths = NomOfMonths;
        this.NutritionalCare = NutritionalCare;
    }

    public int getNomOfMonths() {
        return NomOfMonths;
    }

    public boolean isNutritionalCare() {
        return NutritionalCare;
    }

    public void setNomOfMonths(int nomOfMonths) {
        NomOfMonths = nomOfMonths;
    }

    public void setNutritionalCare(boolean nutritionalCare) {
        NutritionalCare = nutritionalCare;
    }

    public void ToString(){
        if (NutritionalCare)System.out.println("You hav been subscribed on our GYM for " + NomOfMonths +" months with a NutritionalCare");
        else System.out.println("You hav been subscribed on our GYM for " + NomOfMonths +" months without a NutritionalCare");
    }
}
