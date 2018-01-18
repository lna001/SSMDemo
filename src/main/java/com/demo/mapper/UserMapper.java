package com.demo.mapper;

import com.demo.entity.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 2018/1/18.
 */
@Repository("userMapper")
public interface  UserMapper {
    @Select("SELECT * from `user`  where id = #{id}")
    @ResultType(User.class)
    User getEntityById(String  id);
}
