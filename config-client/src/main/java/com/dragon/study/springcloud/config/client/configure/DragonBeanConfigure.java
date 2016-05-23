package com.dragon.study.springcloud.config.client.configure;


import com.dragon.study.springcloud.config.client.bean.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dragon on 16/5/14.
 */
@Configuration
@EnableConfigurationProperties(DragonPersonProperties.class)
public class DragonBeanConfigure{

  @SuppressWarnings("SpringJavaAutowiringInspection")
  @Autowired
  private DragonPersonProperties dragonPersonProperties;

  @Bean(name = "dragon")
  public Person dragon() {
    Person dragon = new Person();
    dragon.setAge(dragonPersonProperties.getAge());
    dragon.setName(dragonPersonProperties.getName());
    dragon.setMale(dragonPersonProperties.isMale());
    System.out.println("create dragon person, " + dragon.toString());
    return dragon;
  }

}
