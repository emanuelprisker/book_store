package com.onlinestore.kodigonlinestore.controller;
import com.onlinestore.kodigonlinestore.model.Item;

public class ItemOrder implements ITotal {
    private Item item;
    private int quantity;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public double getTotal() {
        return 0;
    }
}

