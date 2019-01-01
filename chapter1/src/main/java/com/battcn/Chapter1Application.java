package com.battcn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 我的第一个SpringBoot程序
 * 其中 @RestController 等同于 （@Controller 与 @ResponseBody），用来返回json
 *
 * @author Levin
 * @Configuration 用于定义配置类，被注解的类内部包含有一个或多个被@Bean注解的方法，这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，
 *                并用于构建bean定义，初始化Spring容器。
 * @SpringBootApplication 继承自@Configuration，等同于@Configuration @EnableAutoConfiguration @ComponentScan
 * @ComponentScan默认扫描启动类的所在的包和子包下面所有的注解
 * 
 * @EnableAutoConfiguration 
 * @EnableAutoConfiguration主要是用来开启自动配置，是扫描jar包下配置了META-INF/spring.factories里面的类和针对当前包以及子包下的自定义组件的
 * https://blog.csdn.net/kmhysoft/article/details/71056027
 * 
 * @ComponentScan注解就相当于 xml配置文件中的context:component-scan标签
 * @ComponengScan是用来配置自定义组件的，可以指定base路径或BaseClass


 * 
 * @Configuration的一个使用场景：
 * 1.）如果我们想开发一个jar把供其他人使用，那么我们就在自己工程的spring.factories中配置@@Configuration类，
 * 这样只要其他人在他们项目的POM中加入了我们开发的jar包作为依赖，在他们项目启动的时候就会初始化我们开发的工程中的类。
 * 2.）使用@Configuration注解来代替Spring的bean配置 https://www.cnblogs.com/hujingwei/p/5360944.html
 * 
 * 
 * 
 */
@RestController
@SpringBootApplication
public class Chapter1Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter1Application.class, args);
    }

    @GetMapping("/demo1")
    public String demo1() {
        return "Hello battcn";
    }

   
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        // CommandLineRunner接口实现在项目启动后执行的功能
        return args -> {
            System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(System.out::println);
        };
    }
}