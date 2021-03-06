package aup.cs.shop;

public final class Soaps extends ShavingProduct {

    public Soaps(boolean inStock, String tit, double pri){
        //Initializes a soap object checking if it is in stock
        super(inStock, tit, pri);
    }

    public String toString(){
        // Creates a string representation of a soap object
        String stringForm = super.toString();
        stringForm += ">Soaps";
        return stringForm;
    }
}
