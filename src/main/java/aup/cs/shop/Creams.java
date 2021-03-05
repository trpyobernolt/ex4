package aup.cs.shop;

public class Creams extends ShavingProduct {
    private int id;
    private String title;
    private double price;
    private String category = "Shave>Creams";

    public Creams(int idNum, String tit, double pri) {
        // Initializes Creams
        this.id = idNum;
        this.title = tit;
        this.price = pri;
    }

    @Override
    public String toString() {
        // Creates string with the stored variables in Creams
        String idStr = String.valueOf(id);
        String priceStr = String.valueOf(price);
        return(idStr + "\t" + title + "\t" + priceStr + "\t" + category);
    }
}
