import business.ProductManager;
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import dataAccess.HibernateProductDao;
import entities.Product;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1,"İPhone 11",3500);

        ProductManager  productManager =
                new ProductManager(
                        new HibernateProductDao(),
                        Arrays.asList(new FileLogger(),new DataBaseLogger()));
        productManager.add(product);
    }
}
