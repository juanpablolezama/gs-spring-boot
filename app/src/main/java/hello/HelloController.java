package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello from Spring Boot 24 16/05/2021!";
    }
    
    @RequestMapping("/hello2")
    public String hello2() {
        return "Hello from Spring Boot 2!";
    }
}
