package impatient_java;

import java.util.ArrayList;

/**
 * Created by ilyarudyak on 6/22/16.
 */
public class Invoice {

    private static class Item { // Item is nested inside Invoice
        private String description;
        private int quantity;
        private double unitPrice;

        public Item() {
        }

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        double price() { return quantity * unitPrice; }
        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item(description, quantity, unitPrice);
//        newItem.description = description;
//        newItem.quantity = quantity;
//        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println("total=" + total);
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Blackwell Toaster", 2, 24.95);
        invoice.addItem("ZapXpress Microwave Oven", 1, 49.95);
        invoice.print();
    }
}
