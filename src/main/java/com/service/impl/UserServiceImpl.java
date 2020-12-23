package com.service.impl;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean login(User user) {
        Map<String,Object> param=new HashMap<>();
        param.put("USER_NAME", user.getUserName());
        List<User> users = userMapper.selectByMap(param);
        if (users.size()!=0){
           String username=user.getUserName();
           String dbusername=users.get(0).getUserName();
           String password=user.getPassword();
           String dbpassword=users.get(0).getPassword();
            if (username.equals(dbusername)&&password.equals(dbpassword)){
                return true;
            }
        }
        return false;
    }
}
