package service.impl;

import dao.ProductDao;
import dao.imp.ProductDaoImpl;
import model.Product;
import service.ProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService
{
    private ProductDao productDao;

    public ProductServiceImpl()
    {
        productDao = new ProductDaoImpl();
    }

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
}
