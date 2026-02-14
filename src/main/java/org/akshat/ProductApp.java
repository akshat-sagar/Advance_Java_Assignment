package org.akshat;

import org.akshat.dao.ProductDao;
import org.akshat.entity.Product;

public class ProductApp {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();

        // 🔹 CREATE
        Product product = new Product(
                "Laptop",
                "Gaming Laptop",
                "Electronics",
                5,
                75000.0,
                "SKU101",
                true
        );

        dao.saveProduct(product);
        System.out.println("Product Saved!");

        Long productId = product.getId();

        // 🔹 GET
        Product fetched = dao.getProduct(productId);
        System.out.println("GET: " + fetched.getName());

        // 🔹 LOAD
        Product loaded = dao.loadProduct(productId);
        System.out.println("LOAD: " + loaded.getName());

        // 🔹 UPDATE
        fetched.setPrice(70000.0);
        dao.updateProduct(fetched);
        System.out.println("Product Updated!");

        // 🔹 DELETE
        dao.deleteProduct(productId);
        System.out.println("Product Deleted!");
    }
}
