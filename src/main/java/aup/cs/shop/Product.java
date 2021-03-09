package aup.cs.shop;

public class Product implements Comparable<Product>{
    protected static long totalIds;

    public boolean equals(Object o) {
        // Compares an object to a product and returns if their ID's are equal
        if(o.getClass() != this.getClass()){
            return false;
        }
        else {
            return this.getID() == ((Product)o).getID();
        }
    }

    public int getID() {
        // Gets the ID for a certain product
        String[] str = this.toString().split("\t");
        return Integer.parseInt(str[0]);
    }
    public Double getPrice(){
        String[] str = this.toString().split("\t");
        return Double.parseDouble(str[2]);
    }

    public String getName(){
        String[] str = this.toString().split("\t");
        return str[1];
    }

    @Override
    public int compareTo(Product o) {
        return this.getName().compareTo(o.getName());
    }
}
