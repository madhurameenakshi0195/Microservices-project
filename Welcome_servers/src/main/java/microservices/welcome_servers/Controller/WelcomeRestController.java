package microservices.welcome_servers.Controller;


import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeRestController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        String msg = "Welcome to Madsayysss";

        return msg;
    }

}
