package br.com.caixa.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.caixa.exception.BDException;
import br.com.caixa.json.Response;

public interface ICaixaController {

 public ResponseEntity<Response> cadastraCaixa(@RequestParam String idProduto, @RequestParam String idPessoa, @RequestParam String dtVenda) throws BDException;
	 
	 public ResponseEntity<Response> deleteTodasCaixas() throws BDException;
	 
	 public ResponseEntity<Response> buscaTodasCaixas() throws BDException;
	
	 public ResponseEntity<Response> deleteCaixaObjeto(@RequestParam String idCaixa)throws BDException;
	
}
