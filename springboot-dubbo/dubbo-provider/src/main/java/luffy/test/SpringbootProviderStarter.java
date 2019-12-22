package luffy.test;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration   // 开启Dubbo自动配置功能
public class SpringbootProviderStarter {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootProviderStarter.class, args);
    }
}
