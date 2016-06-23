package complete_reference;

/**
 * Created by ilyarudyak on 6/23/16.
 */
enum Apple3 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price of each apple

    // Constructor
    Apple3(int p) { price = p; }

    int getPrice() { return price; }
}

public class EnumDemo3 {

    public static void main(String args[]) {
//        Apple3 apple;

        // Display price of Winesap.
        System.out.println("Winesap costs " +
                Apple3.Winesap.getPrice() +
                " cents.\n");

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for(Apple3 a : Apple3.values())
            System.out.println(a + " costs " + a.getPrice() +
                    " cents.");
    }
}
