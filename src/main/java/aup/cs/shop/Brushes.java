package aup.cs.shop;

public final class Brushes extends ShavingProduct {
    private String material;

    public Brushes(String tit, double pri, String material){
        // initializes a brush object with a given material
        super(tit, pri);
        this.material = material;
    }
    public Brushes(String tit, double pri){
        // initializes a brush object with no given material
        this(tit, pri, null);
    }

    public String toString(){
        // creates a string representation of brush object
        String stringForm = super.toString();
        stringForm += ">Brushes \t" + material;
        return stringForm;
    }
}
