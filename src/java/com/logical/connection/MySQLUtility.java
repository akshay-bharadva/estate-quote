

package com.logical.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

/**
 *
 * @author Akshay
 */
public class MySQLUtility {

    public List getList(final String sqlQuery) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            connection = initConnection();
            DataSource dataSource = new SingleConnectionDataSource(connection, true);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            List list = jdbcTemplate.queryForList(sqlQuery);
            return list;
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }

    public List getList(final String sqlQuery, final SqlParameterSource paramSource) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            connection = initConnection();
            DataSource dataSource = new SingleConnectionDataSource(connection, true);
            NamedParameterJdbcTemplate npJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
            List list = npJdbcTemplate.queryForList(sqlQuery, paramSource);
            return list;
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }

    public int persist(final String sqlQuery) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            connection = initConnection();
            DataSource dataSource = new SingleConnectionDataSource(connection, true);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            return jdbcTemplate.update(sqlQuery);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }

    public int persist(final String sqlQuery, final SqlParameterSource paramSource) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            connection = initConnection();
            DataSource dataSource = new SingleConnectionDataSource(connection, true);
            NamedParameterJdbcTemplate npJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
            return npJdbcTemplate.update(sqlQuery, paramSource);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }

    public SqlRowSet getRowSet(final String sqlQuery) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            connection = initConnection();
            DataSource dataSource = new SingleConnectionDataSource(connection, true);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(sqlQuery);
            return sqlRowSet;
        } catch (BadSqlGrammarException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
        return null;
    }

    public SqlRowSet getRowSet(final String sqlQuery, final SqlParameterSource paramSource) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            connection = initConnection();
            DataSource ds = new SingleConnectionDataSource(connection, true);
            NamedParameterJdbcTemplate npJdbcTemplate = new NamedParameterJdbcTemplate(ds);
            SqlRowSet sqlRowSet = npJdbcTemplate.queryForRowSet(sqlQuery, paramSource);
            return sqlRowSet;
        } catch (BadSqlGrammarException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
        return null;
    }

    private Connection initConnection() throws ClassNotFoundException, SQLException {
        return ConnectionFactory.getMySQLConnection("jdbc:mysql://localhost:3306/devmysql", "root", "toor");
    }
}
