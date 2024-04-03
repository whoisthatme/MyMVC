package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.Service.CarService;
import web.Service.CarServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public CarService carService() {
        return new CarServiceImpl();
    }
}