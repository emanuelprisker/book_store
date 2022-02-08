package com.onlinestore.kodigonlinestore.Controller;
import com.onlinestore.kodigonlinestore.model.Item;

public class ItemOrder implements com.onlinestore.kodigonlinestore.controller.ITotal {
    private Item item;
    private int quantity;

    public ItemOrder(com.onlinestore.kodigonlinestore.model.Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public double getTotal() {
        return 0;
    }
}

