package cn.org.zhixiang.feign;

/**
 * Created by jizhongcheng on 2019/5/30.
 */

import cn.org.zhixiang.domain.User;
import org.springframework.stereotype.Component;
@Component
public class HystrixClientFallback implements UserFeignClient {
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setName("王五11");
        return user;
    }
}
