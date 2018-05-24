package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public  int insert(User record);

    public  int insertSelective(User record);

    public   List<User> selectAllUser();
}