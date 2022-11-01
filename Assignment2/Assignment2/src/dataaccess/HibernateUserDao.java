package dataaccess;

import entities.User;

public class HibernateUserDao implements UserDao{
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı Hibernate ile veritabanına eklendi" + user);
    }
}
