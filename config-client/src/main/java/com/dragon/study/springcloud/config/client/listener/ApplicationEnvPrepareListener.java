package com.dragon.study.springcloud.config.client.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;

/**
 * Created by dragon on 16/5/25.
 */
public class ApplicationEnvPrepareListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent>, Ordered {


  @Override
  public void onApplicationEvent(
      ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
    System.out.println(applicationEnvironmentPreparedEvent.getEnvironment());
  }

  @Override
  public int getOrder() {
    return Integer.MAX_VALUE - 4;
  }
}
