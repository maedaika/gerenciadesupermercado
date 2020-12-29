package br.com.caixa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.caixa.domain.Caixa;




@Component("caixaRepository")
public interface CaixaRepository extends CrudRepository<Caixa, Integer>{

}

