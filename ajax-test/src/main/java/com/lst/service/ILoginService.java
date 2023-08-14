package com.lst.service;

import com.lst.entity.User;

import java.sql.SQLException;

/**
 * @author Lishuntong
 * @Date 2023/8/12 9:33
 * @functon
 */
public interface ILoginService {
    User login(String uname,String psw) throws SQLException;

}
