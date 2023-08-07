package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.TestRepository;
import service.TestService;

@Configuration
public class JavaConfig {

    @Bean
    public TestRepository testRepository(){
        return new TestRepository();
    }

    @Bean
    public TestService testService(){
        return new TestService(testRepository());
    }

}
