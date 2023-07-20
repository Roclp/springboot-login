package com.example.mapper;


import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface UserMapper {
    User getInfo(String name,String pwd);
}
