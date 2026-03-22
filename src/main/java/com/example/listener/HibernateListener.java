package com.example.listener;

import com.example.util.HibernateUtil;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HibernateListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Initialisation d'Hibernate en cours...");
        HibernateUtil.getSessionFactory();
        System.out.println("Hibernate initialisé avec succès !");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Fermeture d'Hibernate en cours...");
        HibernateUtil.shutdown();
        System.out.println("Hibernate fermé avec succès !");
    }
}