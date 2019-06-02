手动向springboot IOC容器中注入和获取bean
1：注入bean
/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 *
 * 在配置文件中用<bean><bean/>标签添加组件
 *
 */
@Configuration
public class config {
	//将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean(name="helloService")
    public Helloservice helloService(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        Helloservice service = new Helloservice();
        service.setName("zxs");
        service.setAge("26");
        return service;
    }
	
}

2：获取springboot上下文对象
@Component
public class ApplicationContextUtils implements ApplicationContextAware {

	private static ApplicationContext applicationContext;
	

	//获取依赖注入上下文
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("not null");
		if(ApplicationContextUtils.applicationContext == null) {
			System.out.println("null");
			ApplicationContextUtils.applicationContext = applicationContext;
        }
	}
	
	//获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

	
	
	public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }


}

3： 从springboot 上下文对象中获取指定bean
ApplicationContextUtils.getBean("beanname");