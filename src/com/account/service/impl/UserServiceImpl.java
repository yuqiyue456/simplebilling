package com.account.service.impl;

import com.account.dao.UserDao;
import com.account.dao.impl.UserDaoImpl;
import com.account.entity.UsersEx;
import com.account.service.UserService;

import java.sql.SQLException;

/**
 * 用户业务类
 *
 * @author Neal
 */
public class UserServiceImpl implements UserService {
    private static UserDao userDao = new UserDaoImpl();

    @Override
    public UsersEx login(UsersEx usersEx) throws SQLException {
        return userDao.login(usersEx);
    }

    @Override
    public void saveUser(UsersEx usersEx) throws SQLException {
        userDao.saveUser(usersEx);
    }

    @Override
    public void update(UsersEx usersEx) throws SQLException {
        userDao.update(usersEx);
    }

    @Override
    public boolean existPhoneNum(UsersEx usersEx) throws SQLException {
        return userDao.existPhoneNum(usersEx);
    }

    @Override
    public boolean existUserName(UsersEx usersEx) throws SQLException {
        return userDao.existUserName(usersEx);
    }

    @Override
    public boolean existEmail(UsersEx usersEx) throws SQLException {
        return userDao.existEmail(usersEx);
    }
}