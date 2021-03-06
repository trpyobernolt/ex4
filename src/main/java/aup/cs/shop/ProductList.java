package aup.cs.shop;

import java.util.ArrayList;

public class ProductList extends Shop {
    private  ArrayList<Object> products = new ArrayList<>();
    ArrayList<ShavingProduct> shavingProductsArray;
    ArrayList<CosmeticProducts> cosmeticProductsArray;

    public ProductList() {
        populateProducts();
    }

    private void populateProducts() {
        shavingProductsArray = ShavingProduct.getFeed();
        cosmeticProductsArray = CosmeticProducts.getFeed();
        products.addAll(shavingProductsArray);
        products.addAll(cosmeticProductsArray);
    }

    public String getFeed(){
        // Gets the total product feed from all stored products
        String feed = "";
        for (int i = 0; i < this.products.size(); i++) {
            feed += ("ID" + "\t" + "Title" + "\t \t \t" + "Price" + "\t" + "Category" + "\t" + "Material" + "\n");
            feed += products.get(i).toString() + "\n \n";
        }
        return feed;
    }

    public String getMenFeed(){
        // Gets the men's feed from stored products
        String feed = "";
        for (int i = 0; i < this.shavingProductsArray.size(); i++) {
            feed += ("ID" + "\t" + "Title" + "\t \t \t" + "Price" + "\t" + "Category" + "\t" + "Material" + "\n");
            feed += shavingProductsArray.get(i).toString() + "\n \n";
        }
        return feed;
    }

    public String getWomenFeed(){
        // Gets the women's feed from stored products
        String feed = "";
        for (int i = 0; i < this.cosmeticProductsArray.size(); i++) {
            feed += ("ID" + "\t" + "Title" + "\t \t \t" + "Price" + "\t" + "Category" + "\t" + "Material" + "\n");
            feed += cosmeticProductsArray.get(i).toString() + "\n \n";
        }
        return feed;
    }

}
