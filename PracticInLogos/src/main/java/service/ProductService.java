package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService
{
    List<Product> readAll() throws SQLException;

    Product read(int id) throws SQLException;

    void create(Product product) throws SQLException;

    void delete(int id) throws SQLException;

    void update(int id, Product current) throws SQLException;
}
