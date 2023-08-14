package com.lst.service.impl;

import com.lst.dao.ILoginDao;
import com.lst.dao.impl.LoginDaoImpl;
import com.lst.entity.User;
import com.lst.service.ILoginService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Lishuntong
 * @Date 2023/8/12 9:35
 * @functon
 */
public class LoginServiceImpl implements ILoginService {
    ILoginDao iLoginDao=new LoginDaoImpl();

    @Override
    public User login(String uname, String psw) {
        try {
            return iLoginDao.login(uname,psw);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
