package org.schhx.mybatislearn.chapter2.dao;

import org.schhx.mybatislearn.chapter2.entity.User;

public interface UserMapper {

    User selectByPrimaryKey(String id);

    int insert(User record);
}
