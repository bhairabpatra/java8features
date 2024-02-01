package com.java8features.streamapi;

public class MobileModel {
    private int id;
    private String mobileName;
    private String brand;
    private double price;
    private int discount;

    public MobileModel(int id, String mobileName, String brand, double price, int discount) {
        this.id = id;
        this.mobileName = mobileName;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    public MobileModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "MobileModel{" +
                "id=" + id +
                ", mobileName='" + mobileName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
