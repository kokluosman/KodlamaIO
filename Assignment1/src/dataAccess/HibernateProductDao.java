package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao
{
    public void add(Product product){
        //sadece DB erişim kodları buraya yazılır.
        System.out.println("JDBC ile Veritabanına Eklendi");
    }
}
