package com.nguyen.apis.controller;

import com.nguyen.apis.entity.User;
import com.nguyen.apis.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userController")
@PropertySource(value = {"classpath:application.properties"})
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    AppService appService;

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id) {
        try {
            LOGGER.info("=========== START on controller: getUserById with id: {} ===========", id);
            User user = appService.getUserById(id);
            if(user != null) {
                LOGGER.info("RESULT getUserById with id: {} is {}", id, user.getLastName());
                return user;
            } else {
                LOGGER.info("RESULT getUserById with id: {} is null", id);
                return null;
            }
        } catch (Exception e) {
            LOGGER.error("ERROR getUserById with e: {}", e);
            LOGGER.error("", e);
            return null;
        } finally {
            LOGGER.info("=========== END on controller: getUserById with id: {} ===========", id);
        }
    }

}
