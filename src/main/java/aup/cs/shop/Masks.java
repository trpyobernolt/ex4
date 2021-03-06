package aup.cs.shop;

public final class Masks extends CosmeticProducts{

    public Masks(String tit, double pri){
        //Initializes a masks object
        super(tit, pri);
    }

    public String toString(){
        // Creates a string representation of a mask object
        String stringForm = super.toString();
        stringForm += ">Masks";
        return stringForm;
    }
}
