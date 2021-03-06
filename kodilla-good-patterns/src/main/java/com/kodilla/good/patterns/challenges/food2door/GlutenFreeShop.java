package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;
import java.util.HashSet;

public class GlutenFreeShop implements Shop {
    public HashSet<Product> productsList = new HashSet<>();
    private String shopName;

    public GlutenFreeShop(String shopName) {
        this.shopName = shopName;
    }

    public void addProduct(Product product) {
        productsList.add(product);
    }

    @Override
    public boolean process(Order order) {
        for (Product p : order.getListOfProducts()) {
            if (productsList.contains(p)) {
                System.out.println("Products available, sending order to " + shopName);
                System.out.println("Your order will be delivered " + LocalDate.now().plusDays(1));
                System.out.println(order.toString());

                return true;
            }
        }
        System.out.println("Some of the products are not available, please amend the order.");
        System.out.println(order.toString());

        return false;
    }

    @Override
    public String toString() {
        return shopName;
    }
}
