package test;

import entity.Users;
import entityManagerFactoryHibernate.EntityManagerFactoryHibernate;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    private static final String SELECT_USER = "select id from users where phone=79002002222";
    @org.junit.jupiter.api.Test
    void test1(){
        EntityManager entityManager = EntityManagerFactoryHibernate.getEntityManger();
        entityManager.getTransaction().begin();
        System.out.println(entityManager.createQuery(SELECT_USER).getSingleResult());
        entityManager.getTransaction().commit();
        EntityManagerFactoryHibernate.close();


    }





}
