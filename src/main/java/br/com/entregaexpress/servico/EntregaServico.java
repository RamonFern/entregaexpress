package br.com.entregaexpress.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.entregaexpress.models.EntregaModel;
import br.com.entregaexpress.models.RespostaModelo;
import br.com.entregaexpress.repositorio.EntregaRepositorio;

@Service
public class EntregaServico {

  @Autowired
  private EntregaRepositorio er;

  @Autowired
  private RespostaModelo rm;

  public ResponseEntity<?> cadastrarAlterar(EntregaModel em, String acao) {
    if(em.getNome().equals("")) {
      rm.setMensagem("O nome da entraga é obrigatório");
      return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
    } else if(em.getQtd().equals("")) {
      rm.setMensagem("A quantidade é obrigatório");
      return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
    } else {
      if(acao.equals("cadastrar")) {
        return new ResponseEntity<EntregaModel>(er.save(em), HttpStatus.CREATED);
      } else {
        return new ResponseEntity<EntregaModel>(er.save(em), HttpStatus.OK);
      }
    }
  }
  

  public Iterable<EntregaModel> listar() {
    return er.findAll();
  }
}
