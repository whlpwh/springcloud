package wh.learn.producer1.mq;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wh.learn.producer1.Producer1Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Producer1Application.class)
public class HelloApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }

}