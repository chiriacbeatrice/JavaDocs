package ro.teamnet.zth.api.em;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Beatrice.Chiriac on 7/13/2017.
 */
public interface EntityManager {
	<T> T findById(Class<T> entityClass, Long id) throws SQLException;
	Long getNextIdVal(String tableName, String columnIdName) throws SQLException;
    <T> Object insert(T entity) throws SQLException, NoSuchFieldException;
	<T> List<T> findAll(Class<T> entityClass) throws SQLException;


}
