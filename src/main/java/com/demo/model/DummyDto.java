package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Mono;

@Data
@AllArgsConstructor
public class DummyDto {
  private Mono<String> name;
  private String description;
}
