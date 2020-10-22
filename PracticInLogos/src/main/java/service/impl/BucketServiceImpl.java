package service.impl;

import dao.BucketDao;
import dao.imp.BucketDaoImpl;
import model.Bucket;
import service.BucketService;

import java.sql.SQLException;

public class BucketServiceImpl implements BucketService
{
    private BucketDao bucketDao;

    public BucketServiceImpl()
    {
        bucketDao = new BucketDaoImpl();
    }

    @Override
    public Bucket read(int id) throws SQLException
    {
        return null;
    }

    @Override
    public void create(Bucket bucket) throws SQLException
    {

    }

    @Override
    public void delete(int id) throws SQLException
    {

    }
}
