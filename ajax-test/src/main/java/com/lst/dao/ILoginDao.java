package com.lst.dao;

import com.lst.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Lishuntong
 * @Date 2023/8/12 9:36
 * @functon
 */
public interface ILoginDao {
    User login(String uname,String psw) throws SQLException;
}
