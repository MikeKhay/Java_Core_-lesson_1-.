package dao;

import model.Bucket;

import java.sql.SQLException;

public interface BucketDao
{
    Bucket read(int id) throws SQLException, ClassNotFoundException;

    void create(Bucket bucket) throws SQLException, ClassNotFoundException;

    boolean delete(int id) throws SQLException, ClassNotFoundException;
}
