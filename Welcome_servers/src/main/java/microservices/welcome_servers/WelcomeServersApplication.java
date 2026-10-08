package microservices.welcome_servers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class WelcomeServersApplication {

    public static void main(String[] args) {

        SpringApplication.run(WelcomeServersApplication.class, args);
    }

}
