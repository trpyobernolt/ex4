package aup.cs.shop;

import java.util.ArrayList;

public class ShavingProduct extends Shop{
    private long id;
    private String title;
    private double price;

    public ShavingProduct(boolean inStock, String title, double price){
        totalIds++;
        this.id = totalIds;
        this.title = title;
        if(inStock){
            this.price = price;
        }
        else{
            this.price = -1;
        }
    }
    public ShavingProduct(String title, double price){
        this(true, title, price);
    }

    public String toString(){
        String stringForm = id + "\t" + title + "\t" + price + "\t" + "Shaving";
        return stringForm;
    }

    public static ArrayList<ShavingProduct> getFeed() {
        //returns an arraylist of all ShavingProducts
        ArrayList<ShavingProduct> products = new ArrayList<>();
        Creams bourbon = new Creams("Bourbon Shaving Cream", 30.00);
        Creams sandalwood = new Creams("Sandalwood Shaving Cream", 12.00);
        Soaps lavender = new Soaps(true, "Lavender Soap", 30);
        Soaps sandalSoap = new Soaps(false, "Sandalwood Soap", 30);
        Razors straight = new Razors("Shavette Straight Razor", 60.00);
        Razors darkWood = new Razors("5/8 Blade Dark Wood Straight Razor", 160.00);
        Brushes genuineBlack = new Brushes("Genuine Black Shaving Brush", 30.00);
        Brushes silverTip = new Brushes("Silvertip Turnback Shaving Brush", 130.00, "Silver");
        products.add(bourbon);
        products.add(sandalwood);
        products.add(lavender);
        products.add(sandalSoap);
        products.add(straight);
        products.add(darkWood);
        products.add(genuineBlack);
        products.add(silverTip);
        return products;
    }

}
