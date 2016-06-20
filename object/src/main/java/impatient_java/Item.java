package impatient_java;

import java.util.Objects;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class Item {

    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {

        // the same as this == obj
        if (super.equals(obj)) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return  description == ((Item) obj).description &&
                price       == ((Item) obj).price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }

    public static void main(String[] args) {

        Item item = new Item("item", 10);
        Item item2 = new Item("item", 10);

        System.out.println(item.equals(item2));
    }
}













