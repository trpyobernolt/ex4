package aup.cs.shop;

public class Product {
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
}
