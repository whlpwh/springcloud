package wh.learn.consumer3.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wh.learn.consumer3.fegin.impl.HelloWorldServiceImpl;

@FeignClient(name = "producer", fallback = HelloWorldServiceImpl.class)
public interface HelloWorldService {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
