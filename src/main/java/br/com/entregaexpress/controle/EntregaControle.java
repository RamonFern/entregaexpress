package br.com.entregaexpress.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntregaControle {

  @GetMapping("/")
  public String rota() {
    return "API funfando";
  }
  
}
