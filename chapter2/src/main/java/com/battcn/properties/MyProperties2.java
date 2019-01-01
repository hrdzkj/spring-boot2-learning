package com.battcn.properties;

import javax.swing.Spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Levin
 * @since 2018/4/23 0023
 * spring默认使用yml中的配置，但是有使用我们还是想使用 bean.xml 的方式进行配置 bean，
 * 或者给一些类导入配置文件 application.properties 的中的属性，
 * 就需要使用spring-boot-configuration-processor了
 * 
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "my2"：配置文件中哪个下面的所有属性进行一一映射。
 * 注意 person.properties 文件必须放在和 application.properties 文件同一级目录
 * 
 */
@Component
@PropertySource("classpath:my2.properties") //加载配置文件
@ConfigurationProperties(prefix = "my2")
public class MyProperties2 {

    private int age;
    private String name;
    private String email;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MyProperties2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
