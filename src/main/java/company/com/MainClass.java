package company.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass {
   // @Bean
   // public RestTemplate restTemplate() {
    //    return new RestTemplate();
   // }

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
}
