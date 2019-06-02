手动向springboot IOC容器中注入自定义过滤器filter
1：自定义filter
public class MyFilter extends HttpFilter {
	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        if (!(request instanceof HttpServletRequest)) {
            throw new ServletException(request + " not HttpServletRequest");
        }
        if (!(response instanceof HttpServletResponse)) {
            throw new ServletException(request + " not HttpServletResponse");
        }
        
        HttpServletRequest req1 = (HttpServletRequest) request;
        System.out.print("RequestURL:" + req1.getRequestURL() + "\n");
        System.out.print("RequestURI:" + req1.getRequestURI() + "\n");
        doFilter((HttpServletRequest) request, (HttpServletResponse) response, chain);
    }
}

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
    @Bean(name="myfilter")
    public MyFilter myfilter(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new MyFilter();
    }
	
}