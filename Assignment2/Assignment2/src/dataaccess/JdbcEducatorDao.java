package dataaccess;

import entities.Educator;

public class JdbcEducatorDao implements EducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Kategori JDBC ile veri tabanına eklendi " + educator);
    }
}
