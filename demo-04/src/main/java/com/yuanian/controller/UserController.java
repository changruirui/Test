package com.yuanian.controller;

import com.yuanian.pojo.User;
import com.yuanian.utils.UserData;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController      //相当于@Controller+@ResponseBody两个注解的结合,返回json数据，将数据写到服务器
@CrossOrigin        //用来跨域
public class UserController {

    @Autowired
    private UserData userData;

    @PostMapping("user")
    public User show(@RequestBody JSONObject jsonObject){
        String userCode = jsonObject.getString("userCode");
        return userData.selectByusercode(userCode);
    }
}
