/**
 * 
 */
package br.com.gerenciadorproduto.controllers;


import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.gerenciadorproduto.exception.BDException;
import br.com.gerenciadorproduto.json.Response;

/**
 * @author alessandro.maeda
 *
 */
public interface IProdutoController {
	
     public ResponseEntity<Response> cadastraProduto(@RequestParam String codigoBarra,@RequestParam String dcMarca,@RequestParam String dcNome,@RequestParam String descricao,@RequestParam String dtFabricacao,@RequestParam String dtValidade,@RequestParam String idProduto,@RequestParam String origem,@RequestParam String valor,@RequestParam String tblTipoProdutoIdTipoProduto) throws BDException;
	 
	 public ResponseEntity<Response> deleteTodosProduto() throws BDException;
	 
	 public ResponseEntity<Response> buscaTodasProdutos() throws BDException;

}
