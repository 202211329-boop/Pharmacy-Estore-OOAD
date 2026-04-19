
package com.mycompany.main;

public class Medicine {
    private int medID;
    private String name;
    private double price;
    private int stock;

    public Medicine(int medID, String name, double price, int stock) {
        this.medID = medID;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void updateStock(int qty) {
        this.stock += qty;
    }

    public int getStock() { return stock; }
    public String getName() { return name; }
}