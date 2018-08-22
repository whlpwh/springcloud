package wh.learn.zuul.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * 自定义Filter
 */
public class MyZuulFilter  extends ZuulFilter {

    @Override
    public String filterType() {
        // PRE 过滤器在路由到原点之前执行。 示例包括请求身份验证，选择原始服务器以及记录调试信息。
        // ROUTING 过滤器处理将请求路由到原点。 这是使用Apache HttpClient或Netflix Ribbon构建和发送原始HTTP请求的位置。
        // POST 在请求路由到源之后执行过滤器。 示例包括向响应添加标准HTTP标头，收集统计信息和指标，以及将响应从源传输到客户端。
        // ERROR 在其他阶段之一发生错误时执行过滤器。
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
