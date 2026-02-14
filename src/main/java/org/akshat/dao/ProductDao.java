package org.akshat.dao;

import org.akshat.config.HibernateUtil;
import org.akshat.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDao {

    // 🔹 CREATE
    public void saveProduct(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(product);   // Hibernate 6

        transaction.commit();
        session.close();
    }

    // 🔹 GET (returns null if not found)
    public Product getProduct(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Product product = session.get(Product.class, id);

        session.close();
        return product;
    }

    // 🔹 LOAD (throws exception if not found)
    public Product loadProduct(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Product product = session.byId(Product.class).load(id);

        session.close();
        return product;
    }

    // 🔹 UPDATE
    public void updateProduct(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(product);   // Hibernate 6

        transaction.commit();
        session.close();
    }

    // 🔹 DELETE
    public void deleteProduct(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Product product = session.get(Product.class, id);
        if (product != null) {
            session.remove(product);  // Hibernate 6
        }

        transaction.commit();
        session.close();
    }
}
