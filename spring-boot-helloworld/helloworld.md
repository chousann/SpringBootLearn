springboot helloworld

1:@SpringBootApplication注解标注在某个类上，说明这个类是springboot的主配置文件

2:
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = {
		@Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
		@Filter(type = FilterType.CUSTOM,
				classes = AutoConfigurationExcludeFilter.class) })
public @interface SpringBootApplication {
	。。。
}

3:
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
public @interface SpringBootConfiguration {

}
@SpringBootConfiguration注解标注在某个类上，表示这是一个Spring Boot的配置类；

4:
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {
	...
}
@Configuration注解标注在某个类上，表示这是一个配置类，相当于一个配置文件，配置类是一个@Component（组件），会由springboot创建放入spring容器中

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {
	。。。
}

5：
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(AutoConfigurationImportSelector.class)
public @interface EnableAutoConfiguration {
	。。。
}
@EnableAutoConfiguration注解开启自动配置功能；

6：
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(AutoConfigurationPackages.Registrar.class)
public @interface AutoConfigurationPackage {

}
@AutoConﬁgurationPackage：自动配置包  
@Import(AutoConﬁgurationPackages.Registrar.class)：  Spring的底层注解@Import，给容器中导入一个组件；导入的组件由 AutoConﬁgurationPackages.Registrar.class；
将主配置类（@SpringBootApplication标注的类）的所在包及下面所有子包里面的所有组件扫描到Spring容器； 