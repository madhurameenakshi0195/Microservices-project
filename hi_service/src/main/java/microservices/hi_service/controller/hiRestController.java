package microservices.hi_service.controller;

import microservices.hi_service.client.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class hiRestController {

    @Autowired
    private WelcomeFeignClient welcomeClient;

    @GetMapping("/hi")
    public String SayHiMsg(){


        String Himsg = "Hiiii madsayyyy";

        String WelcomeMsg = welcomeClient.getWelcomeMsg();


        return Himsg + WelcomeMsg ;

    }
}
