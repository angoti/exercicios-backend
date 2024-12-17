package com.professorangoti.exercicios;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;

@RestController
public class Controlador {

  @GetMapping("/alo")
  public Dominio greeting() {
    return new Dominio("alô mundo");
  }

  @GetMapping("/dados")
  public List<Object> getDados() throws IOException {
    System.out.println("--------> getDados ==============>");
    ObjectMapper objectMapper = new ObjectMapper();
    Resource resource = new ClassPathResource("dados.json");
    List<Object> dados = objectMapper.readValue(resource.getInputStream(), List.class);
    return dados;
  }
}
