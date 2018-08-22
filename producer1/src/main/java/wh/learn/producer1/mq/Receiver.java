package wh.learn.producer1.mq;

import lombok.extern.log4j.Log4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
@Log4j
public class Receiver {


    @RabbitHandler
    public void process(String hello){
        log.info("receiver :"+hello);
    }
}
