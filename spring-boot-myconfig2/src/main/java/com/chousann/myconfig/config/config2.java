package com.chousann.myconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.chousann.Helloservice;
import com.chousann.myservice2;

/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 *
 * 在配置文件中用<bean><bean/>标签添加组件
 *
 */
@Import({SelfImportSelector.class, SelfImportBeanDefinitionRegistrar.class})
@Configuration
public class config2 {

}
