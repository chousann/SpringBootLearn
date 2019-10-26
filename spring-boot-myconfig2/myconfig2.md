https://www.cnblogs.com/cxyyh/p/11123870.html
虽然Spring提倡零配置，但是还是提供了对xml文件的支持，这个注解就是用来加载xml配置的。例：@ImportResource({“classpath:*.xml)

@import注解
@Import 是被用来整合所有在@Configuration注解中定义的bean配置，作用主要将外部的jar包注入到springioc容器中 @Import(Win7Entity.class) 等于与@Bean
public class MyEntity {
}
@Configuration
@Import(MyInportEntity.class)
public class MyImportConfig {
}
默认注册beanid为 全路径地址
@Import注解与@Bean注解区别:
bean注解注册的 bean的id是以方法名称 @Import以当前类完整路径地址注册 相比来说@Import注入类更加简单

ImportSelector接口是至spring中导入外部配置的核心接口，在SpringBoot的自动化配置和@EnableXXX(功能性注解)都有它的存在

@Import注解的作用
1声明一个bean
2导入@Configuration注解的配置类
3导入ImportSelector的实现类
4导入ImportBeanDefinitionRegistrar的实现类