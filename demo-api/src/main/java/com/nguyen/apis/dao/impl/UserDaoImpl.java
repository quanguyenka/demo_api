package com.nguyen.apis.dao.impl;

import com.nguyen.apis.dao.UserDao;
import com.nguyen.apis.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public User getUserById(Integer id) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        String hql = "FROM User WHERE id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<User> result = query.getResultList();
        if(result.size() > 0) {
            return result.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public Boolean deleteUserById(Integer id) {
        return null;
    }
}
