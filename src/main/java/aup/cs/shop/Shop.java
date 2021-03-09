package aup.cs.shop;

import java.util.*;

public class Shop {
  static ProductList productList;


  public static void main(String[] args) {
    Shop shop = new Shop();
    shop.init();
    System.out.println("Total Feed:");
    System.out.println(shop.createFeed());
    System.out.println("\n \n \n" + "MENS FEED:");
    System.out.println(shop.createMenFeed());
    System.out.println("\n \n \n" + "WOMEN'S FEED:");
    System.out.println(shop.createWomenFeed());
    Object toRemoveMen = productList.getProducts().get(3);
    Object toRemoveWomen = productList.getProducts().get(11);
    System.out.println("ID's that should be removed:");
    System.out.println(toRemoveMen + "\t \t " + toRemoveWomen + "\n \n");
    productList.removeById(toRemoveMen);
    productList.removeById(toRemoveWomen);
    System.out.println("Total Feed Revised After Removal:");
    System.out.println(shop.createFeed());
    System.out.println("\n" + "MENS FEED Revised After Removal:");
    System.out.println(shop.createMenFeed());
    System.out.println("\n" + "WOMEN'S FEED Revised After Removal:");
    System.out.println(shop.createWomenFeed());
    System.out.println("\n \n \n" + "Total Feed Sorted by Price (Low to High):");
    productList.sortByPriceLowtoHigh();
    System.out.println(shop.createFeed());
    System.out.println("\n" + "WOMEN'S FEED Sorted by Price(Low to High:");
    System.out.println(shop.createWomenFeed());
    System.out.println("\n" + "MEN'S FEED Sorted by Price(Low to High):");
    System.out.println(shop.createMenFeed());
    System.out.println("\n \n \n" + "Total Feed Sorted by Price (Highest to Lowest):");
    productList.sortByPriceHightoLow();
    System.out.println(shop.createFeed());
    System.out.println("\n" + "WOMEN'S FEED Sorted by Price(High to Low):");
    System.out.println(shop.createWomenFeed());
    System.out.println("\n" + "MEN'S FEED Sorted by Price(High to Low):");
    System.out.println(shop.createMenFeed());
    System.out.println("\n \n \n" + "Total Feed Alphabetically Sorted:");
    productList.sortAlphabetical();
    System.out.println(shop.createFeed());
    System.out.println("\n" + "WOMEN'S FEED Alphabetically Sorted:");
    System.out.println(shop.createWomenFeed());
    System.out.println("\n" + "MEN'S FEED Alphabetically Sorted:");
    System.out.println(shop.createMenFeed());
    System.out.println("\n \n \n" + "Total Feed Sorted by ID:");
    productList.sortByID();
    System.out.println(shop.createFeed());
    System.out.println("\n" + "WOMEN'S FEED Sorted by ID:");
    System.out.println(shop.createWomenFeed());
    System.out.println("\n" + "MEN'S FEED Sorted by ID:");
    System.out.println(shop.createMenFeed());
  }

  public Shop(){
  }

  public void init(){
    // Initializes the products stored in the shop
     productList = new ProductList();
    }

  public String createFeed() {
    // creates feed to be displayed in the shop
    return productList.getFeed();
  }

  public String createMenFeed(){
    // creates Men's feed to be displayed in the shop
    return productList.getMenFeed();
  }

  public String createWomenFeed(){
    // creates Women's feed to be displayed in the shop
    return productList.getWomenFeed();
  }

}