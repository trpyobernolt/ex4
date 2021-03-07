package aup.cs.shop;

import java.util.ArrayList;

public class CosmeticProducts extends Product {
    private long id;
    private String title;
    private double price;

    public CosmeticProducts(String title, double price){
        totalIds++;
        this.id = totalIds;
        this.title = title;
        this.price = price;
    }

    public String toString(){
        return (id + "\t" + title + "\t" + price + "\t" + "Cosmetics");
    }

    public static ArrayList<CosmeticProducts> getFeed() {
        //returns an arraylist of all ShavingProducts
        ArrayList<CosmeticProducts> products = new ArrayList<>();
        Masks sesderma = new Masks("Sesderma Sesmedical Revitalizing Facial Mask", 7.27);
        Masks sleeping = new Masks("Uriage Eau Thermale Water Sleeping Mask", 21.38);
        Makeup foundation = new Makeup("Flormar Mat Touch Foundation", 18.16);
        Makeup primer = new Makeup("Flormar Glam Strobing Cream", 12.09);
        Dye brown = new Dye("Phytocolor Permanent Color Shade Brown", 13.89);
        Dye blonde = new Dye("Phytocolor Permanent Color Shade Blonde", 13.89);
        products.add(sesderma);
        products.add(sleeping);
        products.add(foundation);
        products.add(primer);
        products.add(brown);
        products.add(blonde);
        return products;
    }
}
