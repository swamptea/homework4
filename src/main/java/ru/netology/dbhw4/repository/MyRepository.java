package ru.netology.dbhw4.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.netology.dbhw4.entity.Persons;

import java.util.List;

@Repository
public class MyRepository {

    @PersistenceContext
    public EntityManager entityManager;

    public MyRepository() {
    }

    public List getPersonsByCity(String city) {
        Query query = entityManager.createQuery("select p from Persons p  where p.city_of_living = :city", Persons.class);
        query.setParameter("city", city);

        return query.getResultList();
    }
}
