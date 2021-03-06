package aup.cs.shop;

public final class Dye extends CosmeticProducts {

    public Dye(String tit, double pri){
        //Initializes a soap object checking if it is in stock
        super(tit, pri);
    }

    public String toString(){
        // Creates a string representation of a soap object
        String stringForm = super.toString();
        stringForm += ">Dyes";
        return stringForm;
    }
}
