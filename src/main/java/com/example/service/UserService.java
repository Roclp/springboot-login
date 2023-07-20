package com.example.service;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserService {
    User login(String name,String pwd);
}
