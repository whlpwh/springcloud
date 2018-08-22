package wh.learn.producer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class Producer3Application {

    public static void main(String[] args) {
        SpringApplication.run(Producer3Application.class, args);
    }
}
