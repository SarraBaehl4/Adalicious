package com.kata.kata5.dtos;

public class MenuCreateDTO {
    private String plate;
    private String description;
    private String image;
    private double price;

    

public MenuCreateDTO(String plate, String description, String image, double price){

    this.plate= plate;
    this.description= description;
    this.image= image;
    this.price= price;
}
//Guetters et Setters
public String getPlate(){return plate;}
public void SetPlate(String plate) {this.plate = plate;}

public String getDescription(){return description;}
public void setDescription(String description) {this.description = description;}

public String getImag(){return image;}
public void SetImage(String image) {this.image = image;}


public double getPrice(){return price;}
public void SetPrice(double price) {this.price = price;}
}

