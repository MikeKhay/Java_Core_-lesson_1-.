package util;

public class SQLConstants {

    public static final String GET_ALL_USERS = "SELECT * FROM store.user";
    public static final String GET_USER_BY_ID = "SELECT * FROM store.user WHERE id = ?";
    public static final String GET_USER_BY_EMAIL = "SELECT * FROM store.user WHERE email = ?";
    public static final String INSERT_USER = "INSERT INTO store.user (id, email, password, first_name, last_name, role) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_USER = "UPDATE store.user SET id = ?, email = ?, password = ?, first_name = ?, last_name = ?, role = ? WHERE (id = ?)";
    public static final String DELETE_USER_BY_ID = "DELETE FROM store.user WHERE id = ?";

    public static final String GET_ALL_PRODUCTS = "SELECT * FROM store.product";
    public static final String GET_PRODUCT_BY_ID = "SELECT * FROM store.product WHERE id = ?";
    public static final String INSERT_PRODUCT = "INSERT INTO store.product (id, name, description, price) VALUES (?, ?, ?, ?)";
    public static final String UPDATE_PRODUCT = "UPDATE store.product SET id = ?, name = ?, description = ?, price = ? WHERE (id = ?)";
    public static final String DELETE_PRODUCT_BY_ID = "DELETE FROM store.product WHERE id = ?";

    public static final String GET_ALL_BUCKETS = "SELECT * FROM store.bucket";
    public static final String GET_BUCKET_BY_ID = "SELECT * FROM store.bucket WHERE id = ?";
    public static final String INSERT_BUCKET = "INSERT INTO store.bucket (id, purchase_date) VALUES (?, ?)";
    public static final String DELETE_BUCKET_BY_ID = "DELETE FROM store.bucket WHERE id = ?";

}
