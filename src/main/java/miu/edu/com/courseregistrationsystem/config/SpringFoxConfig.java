package miu.edu.com.courseregistrationsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("miu.edu.com.studentregistrationsystem"))
                .paths(PathSelectors.any())
                .build();
    }
}
