package dao;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao
{
    List<Product> readAll() throws SQLException, ClassNotFoundException;

    Product read(int id) throws SQLException, ClassNotFoundException;

    void create(Product product) throws SQLException, ClassNotFoundException;

    boolean delete(int id) throws SQLException, ClassNotFoundException;

    void update(int id, Product current) throws SQLException, ClassNotFoundException;

    boolean exists(int id) throws SQLException, ClassNotFoundException;
}
