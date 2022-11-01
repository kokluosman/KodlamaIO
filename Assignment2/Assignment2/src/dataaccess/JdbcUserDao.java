package dataaccess;

import entities.User;

public class JdbcUserDao implements UserDao{
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı JDBC ile veritabanına eklendi" + user);
    }
}
