package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/{temp}")
  public String other(@PathVariable String temp) {
    switch (temp) {
      case "index":
        return "index";

      default:
        return "other";
    }
  }
}
