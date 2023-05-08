package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@RestController
public class DemoController {

  @GetMapping("/dummy")
  public Mono<String> getDummy() {
    return Mono.just("hello world").mapNotNull(str -> str+"++");
  }
}
