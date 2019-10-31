package com.xg.user.server.impl;

import com.xg.user.server.IUserService;
import com.xg.user.util.UserFactory;
import org.springframework.stereotype.Service;

/**
 * @program: userpay
 * @author: gzk
 * @create: 2019-10-31 16:42
 **/
@Service
public class UserServerImpl implements IUserService {

    @Override
    public String userType(String type) {
        // 获取用户类型的实现类
        //PaySevice byUserType = UserFactory.getByUserType(type);
        // 调用实现类中的方法
        //String s = byUserType.userType();
        return UserFactory.getByUserType(type).userType();
    }
}
