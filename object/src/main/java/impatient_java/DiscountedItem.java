package impatient_java;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class DiscountedItem extends Item {

    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }

        return  discount == ( (DiscountedItem) obj ).discount;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public static void main(String[] args) {

        DiscountedItem di = new DiscountedItem("item", 10, 5);
        DiscountedItem di2 = new DiscountedItem("item", 10, 50);

        System.out.println(di.equals(di2));
    }
}





















