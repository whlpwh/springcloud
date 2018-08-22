package wh.learn.producer2.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        log.info("producer2 收到请求: "+name);
        return "hello "+name+"，this is first messge";
    }
}
