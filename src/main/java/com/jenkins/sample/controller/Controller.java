package com.jenkins.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/docker/image/test/controller")
@RestController
public class Controller {
	@GetMapping("/")
  public String resultimageRoot() {
	  return "I'm done here with docker image and spring boot and jenkins CI/CD";
  }
}
