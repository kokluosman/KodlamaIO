package dataaccess;

import entities.Educator;

public class HibernateEducatorDao implements EducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Eğitmen Hibernate ile veri tabanına eklendi " + educator);
    }
}
