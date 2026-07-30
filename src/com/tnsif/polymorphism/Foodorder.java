package com.tnsif.polymorphism;
class Foodorder {

    void order(String item) {
        System.out.println("Ordered: " + item);
    }

    void order(String item, int quantity) {
        System.out.println("Ordered: " + quantity + " " + item);
    }

    void order(String item, int quantity, boolean homeDelivery) {
        System.out.println("Ordered: " + quantity + " " + item +
                (homeDelivery ? " with Home Delivery" : " for Pickup"));
    }

    public static void main(String[] args) {
        Foodorder f = new Foodorder();

        f.order("Pizza");
        f.order("Burger", 2);
        f.order("Pasta", 3, true);
    }
}
