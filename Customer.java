
package com.mycompany.main;

public class Customer {
    private int customerID;
    private String name;
    private String email;

    public Customer(int customerID, String name, String email) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
    }

    public void placeOrder(Order order) {
        System.out.println("Order " + order.getOrderID() + " placed by " + name);
    }
}
