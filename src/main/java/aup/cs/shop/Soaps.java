package aup.cs.shop;

public class Soaps extends ShavingProduct {
    private int id;
    private String title;
    private double price;
    private String category = "Shave>Soaps";

    public Soaps(int idNum, String tit, double pri) {
        // Initializes soaps with a given price
        this.id = idNum;
        this.title = tit;
        this.price = pri;
    }
    public Soaps(int idNum, String tit){
        // Initializes a soap that is out of stock -> does not have given price
        this(idNum, tit, -1);
    }

    @Override
    public String toString() {
        // creates a string representation of the Soap product
        String idStr = String.valueOf(id);
        String priceStr = String.valueOf(price);
        return(idStr + "\t" + title + "\t" + priceStr + "\t" + category);
    }
}
