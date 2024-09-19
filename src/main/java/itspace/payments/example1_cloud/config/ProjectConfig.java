package itspace.payments.example1_cloud.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "itspace.payments.example1_cloud.proxy")
public class ProjectConfig {
}
