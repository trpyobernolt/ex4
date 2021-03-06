package aup.cs.shop;

import java.util.ArrayList;
import java.util.LinkedList;

public class Shop {
  protected static long totalIds;
  ProductList productList;


  public static void main(String[] args) {
    Shop shop = new Shop();
    shop.init();
    System.out.println("Total Feed:");
    System.out.println(shop.createFeed());
    System.out.println("\n \n \n" + "MENS FEED:");
    System.out.println(shop.createMenFeed());
    System.out.println("\n \n \n" + "WOMEN'S FEED:");
    System.out.println(shop.createWomenFeed());
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