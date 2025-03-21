package com.kata.kata5.dtos;

public class OrdersCreateDTO {
    private String customer_name;
    private String status;


public OrdersCreateDTO(String customer_name, String status){
    this.customer_name= customer_name;
    this.status= status;
}
public String getCustomerName() { return customer_name; }
public void setCustomerName(String customer_name) { this.customer_name = customer_name; }

public String getStatus() { return status; }
public void setStatus(String status) { this.status = status; }
}