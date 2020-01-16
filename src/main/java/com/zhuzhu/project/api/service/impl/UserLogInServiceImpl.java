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
        System.out.println("数据库密码："+users.get(0).getUserPassword());
        System.out.println("输入密码："+user.getUserPassword());
        if(users.get(0).getUserPassword().equals(user.getUserPassword())){
            System.out.println("成功i");
            return true;
        }
        return false;
    }
}
