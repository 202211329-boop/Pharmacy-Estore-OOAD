package com.mycompany.main;

public class OrderController {
    
    public boolean processPayment(double amount) {
        // Logic for payment simulation
        System.out.println("Payment of $" + amount + " processed.");
        return true;
    }

    public boolean validatePrescription(String filePath) {
        // Logic for prescription validation
        return filePath != null && !filePath.isEmpty();
    }
}
