import dao.UserDao;
import dao.imp.UserDaoImpl;
import exception.AlreadyExistException;
import exception.NotFoundException;

import java.sql.SQLException;

public class Main
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao service = new UserDaoImpl();

        boolean exist1 = service.exists(1492788709);
        System.out.println(exist1);

        boolean exist2 = service.exists(1492788702);
        System.out.println(exist2);
    }
}
