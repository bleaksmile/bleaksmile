package com.greenfoxacademy.webshop;

public class Item {
  private String name;
  private String description;
  private int price;
  private int quantity;


  public Item(String name, String description, int price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;

  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

}
