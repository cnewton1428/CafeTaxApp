package com.company;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private boolean taxable;

    public Item(String name, double price, int quantity, boolean taxable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
    }

    public Item(String item, double price, int quantity) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public double getCost() {
        double Cost = price * quantity;
        return Cost;
    }
}

