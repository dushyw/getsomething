package com.dusk.getsomething;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class GetsomethingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetsomethingApplication.class, args);
    }

    // 加载YML格式自定义配置文件
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
//        yaml.setResources(new FileSystemResource("config/my.yml"));//File引入
		yaml.setResources(new ClassPathResource("config/my.yml"));//class引入
//        yaml.setResources(new ClassPathResource[]{
//                new ClassPathResource("config/css/css.yml"),
//                new ClassPathResource("config/css/devCss.yml"),
//                new ClassPathResource("config/css/private.yml"),
//                new ClassPathResource("config/css/shared.yml"),
//                new ClassPathResource("config/js/js.yml"),
//                new ClassPathResource("config/js/private.yml"),
//                new ClassPathResource("config/js/devJs.yml"),
//                new ClassPathResource("config/js/shared.yml"),
//                new ClassPathResource("config/cookie/cookie.yml"),
//                new ClassPathResource("redis-spring.yml")
//        });
        configurer.setProperties(yaml.getObject());
        return configurer;
    }

}
