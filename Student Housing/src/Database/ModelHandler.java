package Database;
import Model.Model;
import java.sql.Connection;

public interface ModelHandler {
    void insert(Model model, Connection connection);
    void update(Model model, Connection connection);
    void delete(Model model, Connection connection);
    Model[] getInfo(Connection connection);
}
