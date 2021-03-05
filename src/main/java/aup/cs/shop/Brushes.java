package aup.cs.shop;

public class Brushes extends ShavingProduct {
    private int id;
    private String title;
    private double price;
    private String category = "Shave>Brushes";
    private String material;

    public Brushes(int idNum, String tit, double pri, String mat) {
        // Initializes a Brush product with given material
        this.id = idNum;
        this.title = tit;
        this.price = pri;
        this.material = mat;
    }
    public Brushes(int idNum, String tit, double pri) {
        // Initializes a Brush product with no given material
        this(idNum, tit, pri, null);
    }

    @Override
    public String toString() {
        // Creates a string representation of the brush object
        String idStr = String.valueOf(id);
        String priceStr = String.valueOf(price);
        if(material != null) {
            return (idStr + "\t" + title + "\t" + priceStr + "\t" + category + "\t" + material);
        }
        else {
            return (idStr + "\t" + title + "\t" + priceStr + "\t" + category);
        }
    }
}
