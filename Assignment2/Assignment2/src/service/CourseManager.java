package service;

import core.logging.Logger;
import dataaccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao,List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course  course) throws Exception {
        if (course.getCourseTYPE() == null){
            throw new Exception();
        }
        if (course.getUnitPrice()<=0){
            throw new Exception();
        }

        for (Logger logger : loggers){
            logger.log(String.valueOf(course.getCourseTYPE()));
        }

        courseDao.add(course);
    }
}
