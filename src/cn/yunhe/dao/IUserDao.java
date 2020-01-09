package cn.yunhe.dao;

import cn.yunhe.beans.User;
import cn.yunhe.beans.UserCustom;

import java.util.List;

public interface IUserDao {
    int addUser(User user);
    int updateUser(User user);
    List<User> queryUserList();
    User queryUserById(int uid);
    int addOrder(UserCustom userCustom);
}
