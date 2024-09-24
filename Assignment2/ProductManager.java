package com.Assignment2;

class Product{
    int proID;
    String proName;
    double price;

    Product(int a, String b, double c){
        this.proID = a;
        this.proName = b;
        this.price = c;
    }

    void display(){
        System.out.println("Product ID: "+this.proID);
        System.out.println("Product Name: "+this.proName);
        System.out.println("Price: "+ this.price);
        System.out.println("-------------------------------------");
    }
}

public class ProductManager {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(102, "Smartphone", 599.99);
        Product product3 = new Product(103, "Tablet", 299.99);
        Product product4 = new Product(104, "Smartwatch", 199.99);
        Product product5 = new Product(105, "Headphones", 89.99);

        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();
    }
}
