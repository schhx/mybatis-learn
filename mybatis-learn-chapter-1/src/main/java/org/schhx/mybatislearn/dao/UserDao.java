package org.schhx.mybatislearn.dao;

import org.schhx.mybatislearn.entity.User;

public interface UserDao {

    User selectByPrimaryKey(String id);
}
