package com.yuanian.utils;


import com.yuanian.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserData {

    /**
     * user是一个静态集合对象，可以存储键值对数据，<String, User>表示它的键必须是String类型，值必须是User类型
     */
    private static Map<String, User> user =new HashMap<String, User>();

    static {
        user.put("1",new User("1","常瑞","技术开发部"));
        user.put("2",new User("2","刘曼宁 ","共享交付部"));
        user.put("3",new User("3","杨鹏程 ","预算事业部"));
        user.put("4",new User("4","胡庆 ","产品研发部"));
    }

    public User selectByusercode(String usercode){

        //这里是根据键获取值，根据键，返回值就是User对象
        return user.get(usercode);
    }

}