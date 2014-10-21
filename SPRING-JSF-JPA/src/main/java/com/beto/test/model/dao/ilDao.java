package com.beto.test.model.dao;

import com.beto.test.model.entity.Il;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by BeytullahCaliskan on 30.09.2014.
 */
@Repository
public class ilDao {
    @PersistenceContext(unitName = "SPRING_TESTER")
    EntityManager em;
    public List<Il> selectIlList(){
        TypedQuery<Il> ilTypedQuery= em.createNamedQuery("Il.findAll",Il.class);
        return ilTypedQuery.getResultList();
    }
}
