package com.dragon.study.springcloud.config.client.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * Created by dragon on 16/5/14.
 */
@Data
@ConfigurationProperties(prefix = "person.dragon")
public class DragonPersonProperties {
  private String name;
  private int age;
  private boolean male;
}
