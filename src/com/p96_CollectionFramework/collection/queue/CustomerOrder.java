package com.p96_CollectionFramework.collection.queue;
import java.util.PriorityQueue;

public class CustomerOrder implements Comparable<CustomerOrder>{

    private int orderId;
    private double orderAmount;
    private String customerName;


    public CustomerOrder(int orderId, double orderAmount, String customerName) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }

    @Override
    public int compareTo(CustomerOrder o) {
        return o.orderId > this.orderId ? 1 : -1;
    }

    @Override
    public String toString() {
        return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName:" + customerName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public static void main(String[] args) {
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

        PriorityQueue<CustomerOrder> customerOrders = new PriorityQueue<>();
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll()); //the result comes in descending order of the orderId.
        }
    }
}
