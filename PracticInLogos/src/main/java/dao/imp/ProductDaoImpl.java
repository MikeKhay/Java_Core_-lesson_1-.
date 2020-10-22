package dao.imp;

import dao.ProductDao;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao
{
    @Override
    public List<Product> readAll() throws SQLException
    {
        return null;
    }

    @Override
    public Product read(int id) throws SQLException
    {
        return null;
    }

    @Override
    public void create(Product product) throws SQLException
    {

    }

    @Override
    public void delete(int id) throws SQLException
    {

    }

    @Override
    public void update(int id, Product current) throws SQLException
    {

    }

    @Override
    public boolean exists(int id) throws SQLException
    {
        return false;
    }

}
