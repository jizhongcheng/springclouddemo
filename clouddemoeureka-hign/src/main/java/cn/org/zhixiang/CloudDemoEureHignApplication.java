package cn.org.zhixiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudDemoEureHignApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDemoEureHignApplication.class, args);
    }
}
