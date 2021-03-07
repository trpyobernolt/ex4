package aup.cs.shop;

import java.util.ArrayList;

public class ProductList extends Shop {
    private  ArrayList<Object> products = new ArrayList<>();
    private ArrayList<ShavingProduct> shavingProductsArray;
    private ArrayList<CosmeticProducts> cosmeticProductsArray;

    public ProductList() {
        populateProducts();
    }

    private void populateProducts() {
        shavingProductsArray = ShavingProduct.getFeed();
        cosmeticProductsArray = CosmeticProducts.getFeed();
        products.addAll(shavingProductsArray);
        products.addAll(cosmeticProductsArray);
    }

    public void removeById(Object o) {
        // removes a product by their ID from all feeds
        for (int i = 0; i < products.size(); i++) {
            if (o.equals(products.get(i))) {
                this.products.remove(i);
            }
        }
        for (int i = 0; i < shavingProductsArray.size(); i++) {
            if (o.equals(shavingProductsArray.get(i))) {
                this.shavingProductsArray.remove(i);
            }
        }
        for (int i = 0; i < cosmeticProductsArray.size(); i++) {
            if (o.equals(cosmeticProductsArray.get(i))) {
                this.cosmeticProductsArray.remove(i);
            }
        }
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

    public ArrayList<Object> getProducts() {
        return products;
    }
}
