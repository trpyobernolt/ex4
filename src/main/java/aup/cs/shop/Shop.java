package aup.cs.shop;

import java.util.LinkedList;

public class Shop {
  private static Object[] shavingProducts;

  public static void main(String[] args) {
    Shop shop = new Shop();
    System.out.println(shop.createFeed());
  }
  public Shop() {
    init();
  }
  public String createFeed() {
    // creates feed to be displayed in the shop
    String feed = "";
    for (int i = 0; i < this.shavingProducts.length; i++) {
      feed += ("ID" + "\t" + "Title" + "\t \t \t" + "Price" + "\t" + "Category" + "\t" + "Material" + "\n");
      feed += shavingProducts[i].toString() + "\n \n";
    }
    return feed;
  }

  public static void init(){
    // Initializes the products stored in the shop
    LinkedList<ShavingProduct> products = new LinkedList<>();
    Creams bourbon = new Creams(1, "Bourbon Shaving Cream", 30.00);
    Creams sandalwood = new Creams(2, "Sandalwood Shaving Cream", 12.00);
    Soaps lavender = new Soaps(3, "Lavender Soap", 30);
    Soaps sandalSoap = new Soaps(4, "Sandalwood Soap");
    Razors straight = new Razors(5, "Shavette Straight Razor", 60.00);
    Razors darkWood = new Razors(6, "5/8 Blade Dark Wood Straight Razor", 160.00);
    Brushes genuineBlack = new Brushes(7, "Genuine Black Shaving Brush", 30.00);
    Brushes silverTip = new Brushes(8, "Silvertip Turnback Shaving Brush", 130.00, "Silver");
    products.add(bourbon);
    products.add(sandalwood);
    products.add(lavender);
    products.add(sandalSoap);
    products.add(straight);
    products.add(darkWood);
    products.add(genuineBlack);
    products.add(silverTip);
    shavingProducts = products.toArray();
  }
}