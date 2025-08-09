package com.xworkz.Cricket.Runner;

import com.xworkz.Cricket.Entity.CricketEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Cricket");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();

        List<CricketEntity> cricketEntity=new ArrayList<>();

        cricketEntity.add(new CricketEntity(2,"Surya","bng"));
        cricketEntity.add(new CricketEntity(3,"Reddy","dvg"));
        cricketEntity.add(new CricketEntity(2,"nikkki","shimogha"));

//        CricketEntity cricketEntity=new CricketEntity(1,"Aryan","Davangere");
        entityManager.persist(cricketEntity);
        entityTransaction.commit();

    }
}