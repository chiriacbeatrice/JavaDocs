package ro.teamnet.zth.api.em;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Beatrice.Chiriac on 7/13/2017.
 */
public interface EntityManager {
	<T> T findById(Class<T> entityClass, Long id) throws SQLException;
	Long getNextIdVal(String tableName, String columnIdName) throws SQLException;
    <T> Object insert(T entity) throws SQLException, NoSuchFieldException;
	<T> List<T> findAll(Class<T> entityClass) throws SQLException;
	<T> T update(T entity) throws SQLException, IllegalAccessException, InstantiationException, NoSuchFieldException;
	void delete(Object entity) throws SQLException, NoSuchFieldException, IllegalAccessException;
	<T> List<T> findByParams(Class<T> entityClass,Map<String,Object> params) throws SQLException, NoSuchFieldException, IllegalAccessException;
    <T>List<T>findWithJoinLike(Class<T> entityClass, Class<T> joinedEntityClass,
							   String firstEntityJoinColumn, String secondEntityJoinColumn,
							   String likeSubstring, String likeConditionColumnName) throws SQLException;

}
