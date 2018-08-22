package wh.learn.producer1.mq;

import lombok.extern.log4j.Log4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;


@Component
@Log4j
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){

        String context = "hello "+ new Date();
        log.info("producer1 sender : "+context);
        this.amqpTemplate.convertAndSend("test",context);

    }


    public static void main(String[] args) throws Exception {

        double a = 1.0;
        double b = 0.9;

        System.out.println(decimal2Binary( 0.1));
        System.out.println(decimal2Binary( 0.2));
        System.out.println(decimal2Binary( 0.3));
        System.out.println(decimal2Binary( 0.4));
        System.out.println(decimal2Binary( 0.5));
        System.out.println(decimal2Binary( 0.6));
        System.out.println(decimal2Binary( 0.7));
        System.out.println(decimal2Binary( 0.8));
        System.out.println(decimal2Binary( 0.9));


        System.out.println(new BigDecimal(a).subtract(new BigDecimal(b)).doubleValue());


        System.out.println(new BigDecimal(Double.toString(a)).subtract(new BigDecimal(Double.toString(b))).doubleValue());


    }

    public static String decimal2Binary(double value) throws Exception {
        // 整数部分的值
        int in = (int) value;
//        System.out.println("The integer is: " + in);
        // 小数部分的值
        double r = value - in;
//        System.out.println("The decimal number is: " + r);

        StringBuilder stringBuilder = new StringBuilder();
        // 将整数部分转化为二进制
        int remainder = 0;
        int quotient = 0;
        while (in != 0) {
            // 得商
            quotient = in / 2;
            // 得余数
            remainder = in % 2;
            stringBuilder.append(remainder);
            in = quotient;
        }
        stringBuilder.reverse();
        stringBuilder.append(".");

        // 将小数部分转化为二进制
        int count = 64; // 限制小数部分位数最多为32位，如果超过32为则抛出异常
        double num = 0;
        while (r > 0.0000000001) {
            count--;
            if (count == 0) {
                break;
            }
            if (count%4 == 0){
                stringBuilder.append(" ");
            }
            num = r * 2;
            if (num >= 1) {
                stringBuilder.append(1);
                r = num - 1;
            } else {
                stringBuilder.append(0);
                r = num;
            }
        }

        return stringBuilder.toString();
    }
}
