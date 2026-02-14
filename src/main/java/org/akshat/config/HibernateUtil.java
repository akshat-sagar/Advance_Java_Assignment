package org.akshat.config;
import org.akshat.entity.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {

            Configuration configuration = new Configuration();

            // Load hibernate.cfg.xml
            configuration.configure();

            // Create properties object
            Properties properties = new Properties();

            properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
            properties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/test1");
            properties.put("hibernate.connection.username", "root");
            properties.put("hibernate.connection.password", "00000000");

            properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
            properties.put("hibernate.show_sql", "true");
            properties.put("hibernate.hbm2ddl.auto", "update");

            configuration.setProperties(properties);

            // Add annotated entity class
            configuration.addAnnotatedClass(Product.class);

            sessionFactory = configuration.buildSessionFactory();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

