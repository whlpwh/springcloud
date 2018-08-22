package wh.learn.consumer1.fegin.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import wh.learn.consumer1.fegin.HelloWorldService;

/**
 * 请求失败 给个默认值
 */
@Component
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return name + "熔断";
    }
}
