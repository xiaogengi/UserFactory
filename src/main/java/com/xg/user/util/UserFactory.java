package com.xg.user.util;

import com.xg.user.pay.PaySevice;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: userpay
 * @description: 决策类
 * @author: gzk
 * @create: 2019-10-31 16:43
 **/
public class UserFactory {

    private static Map<String, PaySevice> server = new ConcurrentHashMap<String, PaySevice>();


    // 获取类型对应的实现类
    public static PaySevice getByUserType(String type){
        return server.get(type);
    }


    //初始化时类添加类到map中
    public static void register(String type,PaySevice paySevice){
        Assert.notNull(type,"type is null");
        server.put(type,paySevice);
    }

}
