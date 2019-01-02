用途+写知识点一起才行
chapter3  
ModelAndView是为了理解ModelAndView的工作原理
springBoot用JdbcTemplate实际上没有新的东西，核心就是使用JdbcTemplate而已

为了提高响应速度，默认情况下会缓存模板。如果是在开发中请将spring.thymeleaf.cache 属性设置成 false
chapter4---7都需要数据库环境


覆写资源文件路径
MutipartFile上传文件 transferTo

封装返回给客户端的对象
bean MutipartConfigElement配置限制上传文件大小
GUI查看jar工具  
注解读取配置文件@Value("${my.name}")  
controller,filter,listner  

热部署devTool  
@Get/Post/Put/DeleteMapping   
@RequstParam 设置默认值，比如分页  
@RequestMapping+@RequestBody请求体映射实体类  
注意：需要指定http头content-type=application/json  

@RequestHeader请求头，比鉴权@RequestHeader("access_token")  
@HttpServletRequest request自动注入获取参数 


http://try.redis.io redis命令测试工具

定时任务：@EnableScheduling开始定时任务，自动扫描；
          @Component被容器扫描
          @Scheduled
异步任务:@Component,@EnableAsync @Async 

主流消息队列：RockketMQ,ActiveMQ
用于跨平台、多语言、多项目解耦、分布式事务、RPC等

日志：logback

响应式编程：mono flux
webflux基于功能和基于注解两种风格 



Servlet3.0特性(异步)。  
全局异常：@ControllerAdvice  @RestControllerAdvice   

filter检票员doFilter放行，否则重定向  
应用场景：权限控制，用户登录(非前后端分离场景)等  
启动类需要加入@ServletComponentScan  


Servlet3.0自定义Servlet @WebServlet  

监听器@WebListener  
servletContextListener 应用启动时触发servlet上下文的监听器。  
httpSessionListener  
servletRequestListener.  

拦截器不生效场景问题：  
是否有加@Configuration  
拦截器路径是否有问题**和*  
拦截器最后路径一定要“/**”,如果是目录的话则是/*/  
