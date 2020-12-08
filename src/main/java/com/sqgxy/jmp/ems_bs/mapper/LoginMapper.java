package com.sqgxy.jmp.ems_bs.mapper;


import com.sqgxy.jmp.ems_bs.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface LoginMapper {

    User UserLogin(@Param(value = "userName")String userName,@Param(value = "userPassword")String userPassword);
    int InsertUser(User user);
}
