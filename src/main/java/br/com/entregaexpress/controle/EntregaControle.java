package br.com.entregaexpress.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.entregaexpress.models.EntregaModel;
import br.com.entregaexpress.servico.EntregaServico;

@RestController
public class EntregaControle {

  @Autowired
  private EntregaServico es;


  @PutMapping("/alterar")
  public ResponseEntity<?> Alterar(@RequestBody EntregaModel em) {
    return es.cadastrarAlterar(em, "alterar");
  }

  @PostMapping("/cadastrar")
  public ResponseEntity<?> cadastrar(@RequestBody EntregaModel em) {
    return es.cadastrarAlterar(em, "cadastrar");
  }

  @GetMapping("/listar")
  public Iterable<EntregaModel> listar() {
    return es.listar();
  }

  @GetMapping("/")
  public String rota() {
    return "API funfando";
  }
  
}
