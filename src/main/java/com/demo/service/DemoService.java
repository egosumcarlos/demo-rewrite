package com.demo.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Mono;

@Data
@AllArgsConstructor
public class DemoService {
  private String description;
  public Mono<String> getDummy() {
    return Mono.just("Hellos World")
      .mapNotNull(str -> str + " hello ");
  }
}
