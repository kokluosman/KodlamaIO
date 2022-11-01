import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataaccess.*;
import entities.*;
import service.CategoryManager;
import service.CourseManager;
import service.EducatorManager;
import service.UserManager;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) throws Exception {
        Course course = new Course(CourseTYPE.JAVA,5);
        User user = new User(1,"Osman","Koklu","ok@gmail.com","asda");
        Educator educator = new Educator("Engin","Demirog",course);
        Category category = new Category(course,"Programlama");

        UserManager userManager = new UserManager(new HibernateUserDao(),
                Arrays.asList(new MailLogger(),new FileLogger(), new DatabaseLogger()));

        EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(),
                Arrays.asList(new FileLogger(), new DatabaseLogger()));

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),
                Arrays.asList(new MailLogger(), new DatabaseLogger()));

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),
                Arrays.asList(new MailLogger(),new FileLogger()));

        categoryManager.add(category);
        courseManager.add(course);
        educatorManager.add(educator);
        userManager.add(user);
    }
}
