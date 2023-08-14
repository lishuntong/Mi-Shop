package com.lst.dao.impl;

import com.lst.dao.ILoginDao;
import com.lst.entity.User;
import com.lst.utils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Lishuntong
 * @Date 2023/8/12 9:46
 * @functon
 */
public class LoginDaoImpl implements ILoginDao {
    QueryRunner queryRunner=new QueryRunner(DbUtils.getDatasource());

    @Override
    public User login(String uname, String psw) throws SQLException {
        String sql="select * from user where uname=? && psw=?";
        return queryRunner.query(sql, new BeanHandler<>(User.class), uname, psw);
    }
}
