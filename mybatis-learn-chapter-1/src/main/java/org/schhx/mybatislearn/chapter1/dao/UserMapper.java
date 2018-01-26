package org.schhx.mybatislearn.chapter1.dao;

import org.schhx.mybatislearn.chapter1.entity.User;

public interface UserMapper {

    User selectByPrimaryKey(String id);

    int insert(User record);
}
