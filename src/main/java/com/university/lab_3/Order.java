package com.university.lab_3;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> cart;
    private String status;

    public Order(int orderId, ArrayList<Product> cart){
        this.cart = cart;
        this.status = "Pending";
    }

    public void placeOrder(){
        if(!cart.isEmpty()){
            this.status = "Placed";
        }
    }
    public String getStatus(){
        return this.status;
    }
}
