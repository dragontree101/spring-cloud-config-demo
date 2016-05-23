package com.dragon.study.springcloud.config.client.controller;


import com.dragon.study.springcloud.config.client.bean.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dragon on 16/5/14.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  private Person dragon;

  @Autowired
  Environment env;


  @RequestMapping("/dragon")
  public String dragon() {
    return dragon.toString();
  }

}
