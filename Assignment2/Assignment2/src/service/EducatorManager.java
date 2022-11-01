package service;

import core.logging.Logger;
import dataaccess.EducatorDao;
import entities.Educator;

import java.util.List;

public class EducatorManager {

    private EducatorDao educatorDao;
    private List<Logger> loggers;

    public EducatorManager(EducatorDao educatorDao,List<Logger> loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }
    public void add(Educator educator){

        for (Logger logger: loggers){
            logger.log(educator.getName());
        }
        educatorDao.add(educator);
    }
}
