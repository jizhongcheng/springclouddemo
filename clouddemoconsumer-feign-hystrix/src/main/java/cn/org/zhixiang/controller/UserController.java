package cn.org.zhixiang.controller;

import cn.org.zhixiang.domain.User;
import cn.org.zhixiang.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        System.out.println("AAAAAbbbbbbbbbbbbbbbb");
        return userFeignClient.getUser(id);
    }

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @GetMapping("/getUser/{id}")
//    public User getUser(@PathVariable Long id){
////        return restTemplate.getForObject("http://localhost:8078/user/getUser/"+id,User.class);
//        return restTemplate.getForObject("http://provider-demo/user/getUser/"+id,User.class);
//    }
}
