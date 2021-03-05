package aup.cs.shop;

public class Razors extends ShavingProduct {
    private int id;
    private String title;
    private double price;
    private String category = "Shave>Razors";

    public Razors(int idNum, String tit, double pri) {
        // Initializes a razor product
        this.id = idNum;
        this.title = tit;
        this.price = pri;
    }

    @Override
    public String toString() {
        // Creates a string representation of a razor product
        String idStr = String.valueOf(id);
        String priceStr = String.valueOf(price);
        return(idStr + "\t" + title + "\t" + priceStr + "\t" + category);
    }
}
