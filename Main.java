
package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        // 1. إنشاء مستخدم (Customer)
        Customer customer = new Customer(1, "Ahmad", "ahmad@email.com");

        // 2. إنشاء دواء (Medicine)
        Medicine panadol = new Medicine(101, "Panadol", 5.5, 50);

        // 3. إنشاء طلب (Order)
        Order order = new Order(1001);

        // 4. المستخدم يقوم بتأكيد الطلب
        customer.placeOrder(order);

        // 5. تشغيل العمليات عبر المتحكم (Controller)
        OrderController controller = new OrderController();
        controller.processPayment(15.0); // الدفع
        
        System.out.println("System executed successfully!");
    }
}
