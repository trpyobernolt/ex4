package aup.cs.shop;

public final class Razors extends ShavingProduct {

    public Razors(String tit, double pri){
        // Initializes a razor object
        super(tit, pri);
    }

    public String toString(){
        // Creates a string representation of a razor object
        String stringForm = super.toString();
        stringForm += ">Razors";
        return stringForm;
    }
}
