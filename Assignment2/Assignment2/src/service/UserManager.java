package service;

import core.logging.Logger;
import dataaccess.UserDao;
import entities.User;

import java.util.List;

public class UserManager {
    private UserDao userDao;
    private List<Logger> loggers;

    public UserManager(UserDao userDao,List<Logger> loggers) {
        this.userDao = userDao;
        this.loggers = loggers;
    }
    public void add(User user) throws Exception {
        if (user.getName().isEmpty()){
            throw new Exception();
        }
        for (Logger logger: loggers){
            logger.log(user.getName());
        }
        userDao.add(user);
    }

}
