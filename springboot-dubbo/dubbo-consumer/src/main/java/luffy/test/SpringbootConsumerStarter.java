package luffy.test;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootConsumerStarter {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerStarter.class, args);
    }
}
