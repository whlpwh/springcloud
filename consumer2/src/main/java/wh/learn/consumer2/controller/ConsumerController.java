package wh.learn.consumer2.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wh.learn.consumer2.fegin.HelloWorldService;

@RestController
@Log4j
@RefreshScope
public class ConsumerController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/hello/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        log.info("Consumer 收到请求：" + name);
        return helloWorldService.hello(name);
    }



    @Value("${msg}")
    private String msg;

    @RequestMapping("/hi")
    public String from() {
        return this.msg;
    }
}
