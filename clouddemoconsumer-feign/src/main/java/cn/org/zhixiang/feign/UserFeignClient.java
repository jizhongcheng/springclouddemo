package cn.org.zhixiang.feign;

import cn.org.zhixiang.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider-demo")
public interface UserFeignClient {

    @GetMapping(value = "/user/getUser/{id}")
    public User getUser(@PathVariable("id")Long id);
}
//restTemplate.getForObject("http://provider-demo/user/getUser/"+id,User.class);