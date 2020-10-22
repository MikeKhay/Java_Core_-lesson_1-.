package dao;

import model.Bucket;

import java.sql.SQLException;

public interface BucketDao
{
    Bucket read(int id) throws SQLException;

    void create(Bucket bucket) throws SQLException;

    void delete(int id) throws SQLException;
}
