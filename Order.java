
package com.mycompany.main;

import java.util.Date;

public class Order {
    private int orderID;
    private Date date;
    private String status;

    public Order(int orderID) {
        this.orderID = orderID;
        this.date = new Date();
        this.status = "Created";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    
    public int getOrderID() { return orderID; }
}