package cn.org.zhixiang.controller;

import cn.org.zhixiang.domain.User;
import cn.org.zhixiang.mq.MqMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jizhongcheng on 2019/5/22.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable Long id){
        System.out.println("11111111111133322222222");
        User user=new User();
        user.setId(id);
        user.setName("李四");
        user.setAge(18);
        return user;
    }
    @GetMapping(value = "/getName")
    public String getName(){
        return "李四";
    }

    @Autowired
    private MqMessageProducer mqMessageProducer;

    @GetMapping(value = "/testMq")
    public String testMq(@RequestParam("msg")String msg){
        mqMessageProducer.sendMsg(msg);
        return "发送成功";
    }
}
