package com.zhuzhu.project.api.service.impl;

import com.zhuzhu.project.api.mapper.UserMapper;
import com.zhuzhu.project.api.model.Criteria;
import com.zhuzhu.project.api.model.User;
import com.zhuzhu.project.api.service.UserLogInService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserLogInServiceImpl implements UserLogInService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {
        Criteria criteria = new Criteria();
        criteria.put("userSerialId",user.getUserSerialId());
        List<User> users = userMapper.selectByParams(criteria);
        if(users.size()==0){
            return false;
        }
        if(users.get(0).getUserPassword().equals(user.getUserPassword())){
            return true;
        }
        return false;
    }
}
