package dao.imp;

import dao.ProductDao;
import model.Product;
import util.MySqlConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao
{
    @Override
    public List<Product> readAll() throws SQLException, ClassNotFoundException {
        List<Product> products = new ArrayList<>();
        try (Connection connection = MySqlConnector.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(
                     "SELECT * FROM product"
             )){

            Product product = new Product();
            while (resultSet.next()){
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getDouble("price"));
                product.setBucketId(resultSet.getInt("bucket_id"));

                products.add(product);
            }
        }
        return products;
    }

    @Override
    public Product read(int id) throws SQLException, ClassNotFoundException {
        try (Connection connection = MySqlConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT * FROM product WHERE id =?"
             )) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            Product product = new Product();
            while (resultSet.next()) {
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setPrice(resultSet.getDouble("price"));
                product.setBucketId(resultSet.getInt("bucket_id"));
            }
        }
        return null;
    }

    @Override
    public void create(Product product) throws SQLException, ClassNotFoundException {
        try (Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO product(name, description, price, bucket_id) VALUES(?, ?, ?, ?)"
            )){
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getBucketId());
            statement.execute();

        }
    }

    @Override
    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        try(Connection connection = MySqlConnector.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM product WHERE id = ?"
        )){
            statement.setInt(1, id);
            return statement.execute();
        }
    }

    @Override
    public void update(int id, Product product) throws SQLException, ClassNotFoundException {
        try (Connection connection = MySqlConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE product SET id = ?, name = ?, description = ?, price = ? WHERE (id = ?)")){
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setInt(4, product.getBucketId());
            statement.setInt(1, id);
        }
    }

    @Override
    public boolean exists(int id) throws SQLException, ClassNotFoundException {
        try (Connection connection = MySqlConnector.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "SELECT 1 FROM product WHERE id = ?"
        )){
            statement.setInt(1, id);
            return statement.execute();
        }
    }

}
