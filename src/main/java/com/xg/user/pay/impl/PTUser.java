package com.xg.user.pay.impl;

import com.xg.user.pay.PaySevice;
import com.xg.user.util.UserFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @program: userpay
 * @description: 普通用户处理
 * @author: gzk
 * @create: 2019-10-31 16:44
 **/
@Service
public class PTUser implements PaySevice, InitializingBean {
    @Override
    public String userType() {
        return "普通用户";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserFactory.register("pt",this);
    }
}
