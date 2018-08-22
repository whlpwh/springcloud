package wh.learn.producer3.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {

        log.info("producer3 收到请求: "+name);
        return "hello "+name+"，this is first messge";
    }
}
