package br.com.entregaexpress.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.entregaexpress.models.EntregaModel;

@Repository
public interface EntregaRepositorio extends CrudRepository<EntregaModel, Long>{

  
}
