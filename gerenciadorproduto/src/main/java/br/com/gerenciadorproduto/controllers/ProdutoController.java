/**
 * 
 */
package br.com.gerenciadorproduto.controllers;

import java.awt.print.PrinterGraphics;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciadorproduto.BO.ProdutoBO;
import br.com.gerenciadorproduto.domain.Produto;
import br.com.gerenciadorproduto.exception.BDException;
import br.com.gerenciadorproduto.json.Response;
import br.com.gerenciadorproduto.util.DataUtil;

/**
 * @author alessandro.maeda
 *
 */
@RestController
@RequestMapping("/api/gerenciadorproduto/v1")
@Configuration
@ComponentScan("br.com.gerenciadorproduto")
public class ProdutoController implements IProdutoController {

	@Autowired
	ProdutoBO produtoBO =null;
	
	@RequestMapping(value = "/produto/cadastro", method =  RequestMethod.POST)
	public ResponseEntity<Response> cadastraProduto(String codigoBarra, String dcMarca, String dcNome, String descricao, String dtFabricacao, String dtValidade, String idProduto, String origem, String valor, String tblTipoProdutoIdTipoProduto)	throws BDException {
		 
		// TODO Auto-generated method stub
		
		Produto produto = new Produto();
		Response response = new Response();
				
		try {
			produto.setCodigoBarra(codigoBarra);
			produto.setDcMarca(dcMarca);
			produto.setDcNome(dcNome);
			produto.setDescricao(descricao);
			DataUtil dataUtil = new DataUtil();
	/*		dataUtil.parseDataBanco(dtValidade);
			dataUtil.parseDataBanco(dtFabricacao);*/
			produto.setDtFabricacao(dataUtil.parseDataBanco(dtFabricacao));
			produto.setDtValidade(dataUtil.parseDataBanco(dtValidade));
			produto.setIdProduto(new Integer(idProduto));
			produto.setOrigem(origem);
			produto.setValor(valor);
			produto.setTblTipoProdutoIdTipoProduto(new Integer(tblTipoProdutoIdTipoProduto));
			response.setModeloRetorno(produtoBO.cadastraProduto(produto));
			response.setMensagensRetorno("Cadastro realizado com sucesso!!!");
			
		} catch (Exception e) {
			// TODO: handle exception
			response.setMensagensRetorno(e.getMessage());
		}
		
		return ResponseEntity.ok(response);
	}

	@Override
	@RequestMapping(value = "/produto/delete/todas", method =  RequestMethod.DELETE)
	public ResponseEntity<Response> deleteTodosProduto() throws BDException {
		// TODO Auto-generated method stub
		Response response = new Response();
		
		try {
			produtoBO.deleteTodasProdutos();
			response.setMensagensRetorno("Todas os produtos foram apagadas da base de dados!!!");
			
		} catch (Exception e) {
			// TODO: handle exception
			response.setMensagensRetorno(e.getMessage());	
		}
		return ResponseEntity.ok(response);
	}

	
	@Override
	@RequestMapping(value = "/produto/busca/todas", method =  RequestMethod.GET)
	public ResponseEntity<Response> buscaTodasProdutos() throws BDException {
		// TODO Auto-generated method stub
		Response response = new Response();
		try {
			response.setModeloRetorno(produtoBO.buscaTodasProdutos());
			response.setMensagensRetorno("Todas os produtos contidas na base de dados!!!");
			
		} catch (Exception e) {
			response.setMensagensRetorno(e.getMessage());
		}
		return ResponseEntity.ok(response);
	}

}
