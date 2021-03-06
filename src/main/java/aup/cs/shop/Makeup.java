package aup.cs.shop;

public final class Makeup extends CosmeticProducts {

    public Makeup(String tit, double pri){
        //Initializes a makeup object
        super(tit, pri);
    }

    public String toString(){
        // Creates a string representation of a makeup object
        String stringForm = super.toString();
        stringForm += ">Makeup";
        return stringForm;
    }
}
