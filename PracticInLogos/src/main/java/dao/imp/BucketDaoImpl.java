package dao.imp;

import dao.BucketDao;
import model.Bucket;
import util.MySqlConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BucketDaoImpl implements BucketDao
{
    @Override
    public Bucket read(int id) throws SQLException, ClassNotFoundException {
        try (Connection connection = MySqlConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT * FROM bucket WHERE id = ?"
             )){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            Bucket bucket = new Bucket();
            while (resultSet.next()){
                bucket.setId(resultSet.getInt("id"));
                bucket.setPurchaseDate(resultSet.getTimestamp("purchase_date"));
            }

        }
        return null;
    }

    @Override
    public void create(Bucket bucket) throws SQLException, ClassNotFoundException {
        try (Connection connection = MySqlConnector.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO bucket(id,purchase_date) VALUES (?, ?)"
        )){
            statement.setInt(1,bucket.getId());
            statement.setTimestamp(2,bucket.getPurchaseDate());
        }

    }

    @Override
    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        try (Connection connection = MySqlConnector.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM bucket WHERE id = ?"
        )){
            statement.setInt(1, id);
            return statement.execute();
        }

    }
}
