package service;

import core.logging.Logger;
import dataaccess.CategoryDao;
import dataaccess.CourseDao;
import entities.Category;
import entities.Course;

import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao,List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category){

        for (Logger logger : loggers){
            logger.log(category.getProgramming());
        }
        categoryDao.add(category);
    }
}
