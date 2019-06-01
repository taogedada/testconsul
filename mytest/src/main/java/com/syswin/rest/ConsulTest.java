package com.syswin.rest;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

/**
 * docker下载安装教程：https://www.cnblogs.com/ityouknow/p/8588725.html
 * 执行packge会进行生成镜像的操作
 * docker与idea的整合详情https://www.cnblogs.com/hsz-csy/p/9488469.html
 * 以下注掉的代码均是测试consul所用，因为consul装在Windows上，以测试模式（-Dev）启动
 * 导致虚拟机上的服务（docker将本地服务打包生成镜像并创建容器传到服务器上）无法注册到本地而报错
 * 如果想测试整合docker和consul需要在虚拟机上安装consul并以server或者client模式启动
 */
@RestController
public class ConsulTest {
int a = 1;
int j = 1;
int d = 2;
   int f = 1;
//    @Autowired
//    private LoadBalancerClient loadBalancer;
//    @Autowired
//    private DiscoveryClient discoveryClient;
//    @Autowired
//    private FeginTest feginTest;
    /**
     * 获取所有服务
     */
//    @RequestMapping("/services")
//    public Object services() {
//        return discoveryClient.getInstances("aaa");
//    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
//    @RequestMapping("/discover")
//    public Object discover() {
//        return loadBalancer.choose("aaa").getUri().toString();
//    }

    /**
     * 测试consul负载均衡接口
     * @return
     */
//    @RequestMapping("/call")
//    public String call() {
//        ServiceInstance serviceInstance = loadBalancer.choose("aaa");
//        System.out.println("服务地址：" + serviceInstance.getUri());
//        System.out.println("服务名称：" + serviceInstance.getServiceId());
//
//        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/hello", String.class);
//        System.out.println(callServiceResult);
//        return callServiceResult;
//    }

    @RequestMapping("hello")
    public String getResult(){
        return "hello";
    }

    /**
     * 测试fegin客户端调用接口
     * @return
     */
//    @RequestMapping("testFegin")
//    public String getResultByFegin(){
//        return feginTest.getResult();
//    }

}
