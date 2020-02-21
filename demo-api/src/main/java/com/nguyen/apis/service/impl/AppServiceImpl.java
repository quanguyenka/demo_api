package com.nguyen.apis.service.impl;

import com.nguyen.apis.dao.UserDao;
import com.nguyen.apis.entity.User;
import com.nguyen.apis.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppServiceImpl.class);

    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        try {
            LOGGER.info("=========== START on service: getUserById ===========");
            if(id != null) {
                LOGGER.info("getUserById with id = {}", id);
                User user = userDao.getUserById(id);
                if(user != null) {
                    LOGGER.info("RESULT getUserById with id: {} is userName: {}", id, user.getLastName());
                    return user;
                } else {
                    LOGGER.info("RESULT getUserById with id: {} is null");
                    return null;
                }
            }
            LOGGER.info("FAIL getUserById, CAUSE id is null");
            return null;
        } catch (Exception e) {
            LOGGER.error("ERROR getUserById with error: {}", e);
            LOGGER.info("", e);
            return null;
        } finally {
            LOGGER.info("========== END on service: getUserById ==========");
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
