package com.dragon.study.springcloud.config.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.RequestMatcher;

/**
 * Created by dragon on 16/5/23.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      RequestMatcher csrfRequestMatcher = (request) -> false;
      http.csrf().requireCsrfProtectionMatcher(csrfRequestMatcher);

      http.authorizeRequests().antMatchers("/encrypt", "/encrypt/**", "/decrypt", "/decrypt/**").hasRole("ADMIN");
      http.authorizeRequests().anyRequest().hasRole("USER");
      http.httpBasic();
    }

  @Override
  protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
    authManagerBuilder.inMemoryAuthentication().withUser("user").password("jF#{A{uCP4").roles("USER")
        .and().withUser("admin").password("/tD+QA2[bz").roles("USER", "ADMIN");
  }
}
