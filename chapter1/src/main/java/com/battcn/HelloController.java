package com.battcn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//参考https://www.cnblogs.com/jiangbei/p/8432985.html
@Controller
public class HelloController {
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	@ResponseBody
    public String sayHello(){
        return "index"; 
        /**
         * 这个类的目的在于理解：@Controller 和 @RestController
         * 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html
         * 
         * @responseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
         * 写入到response对象的body区，通常用来返回JSON数据或者是XML
         * 
         * 使用@Controller 注解，在对应的方法上，视图解析器可以解析return 的jsp,html页面，并且跳转到相应页面
         */
    }
}
