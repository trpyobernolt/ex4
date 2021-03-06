package aup.cs.shop;

public final class Creams extends ShavingProduct {
    public Creams(String tit, double pri){
        // Initializes a cream object
        super(tit, pri);
    }

    public String toString(){
        // Creates a string representation of cream object
        String stringForm = super.toString();
        stringForm += " >Creams";
        return stringForm;
    }
}
