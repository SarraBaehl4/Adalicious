package com.kata.kata5.dtos;

public class MenuOrdersCreateDTO {
    private int quantity;

public MenuOrdersCreateDTO(int quantity){
    this.quantity = quantity;
}

public int getQuantity() { return quantity; }
public void setQuantity(int quantity) { this.quantity = quantity; }
}
