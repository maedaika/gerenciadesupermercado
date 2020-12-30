package br.com.caixa.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import br.com.caixa.bo.CaixaBo;
import br.com.caixa.domain.Caixa;
import br.com.caixa.exception.BDException;
import br.com.caixa.json.Response;
import br.com.caixa.util.DataUtil;

@RestController
@RequestMapping("/api/caixa/v1")
@Configuration
@ComponentScan("br.com.caixa.controllers")

public class CaixaController implements ICaixaController {

	@Autowired
	CaixaBo caixaBo = null;
	
	@Override
	@RequestMapping(value = "/cadastro", method =  RequestMethod.POST)
public ResponseEntity<Response> cadastraCaixa(String idProduto, String idPessoa, String dtVenda)throws BDException {
		
		
		Caixa caixa = new Caixa();
		Response response = new Response();
		try {
			caixa.setIdProduto(new Integer(idProduto));
			caixa.setIdPessoa(new Integer(idPessoa));
			DataUtil dataUtil=new DataUtil();
			caixa.setDtVenda(dataUtil.parseDataBanco(dtVenda));			
			response.setModeloRetorno(caixaBo.cadastraCaixa(caixa));
			response.setMensagensRetorno("Cadastro realizado com sucesso!!!");
			
		} catch (Exception e) {
			response.setMensagensRetorno(e.getMessage());			
		}
		
		
		return ResponseEntity.ok(response);
	
	}

	@Override
	@RequestMapping(value = "/delete/todas", method =  RequestMethod.DELETE)
	public ResponseEntity<Response> deleteTodasCaixas() throws BDException {
        Response response = new Response();
		
		try {
			caixaBo.deleteTodasCaixas();			
			response.setMensagensRetorno("Todas as caixas foram apagadas da base de dados!!!");
			
		} catch (Exception e) {
			response.setMensagensRetorno(e.getMessage());			
		}		
		
		return ResponseEntity.ok(response);
	
	}

	@Override
	@RequestMapping(value = "/busca/todas", method =  RequestMethod.GET)
	public ResponseEntity<Response> buscaTodasCaixas() throws BDException {
      Response response = new Response();
		
		try {			
			response.setModeloRetorno(caixaBo.buscaTodasCaixas());
			response.setMensagensRetorno("Todas as caixas contidas na base de dados!!!");
			
		} catch (Exception e) {
			response.setMensagensRetorno(e.getMessage());			
		}		
		
		return ResponseEntity.ok(response);
		
	}

	@Override
	@RequestMapping(value = "/delete/caixaobjeto", method =  RequestMethod.DELETE)
	public ResponseEntity<Response> deleteCaixaObjeto(String idCaixa) throws BDException {
        Response response = new Response();
		Caixa caixa = new  Caixa();
		
		try {
			caixa.setIdCaixa(new Integer(idCaixa));
			caixaBo.deleteCaixaObjeto(caixa); ;			
			response.setMensagensRetorno("Todas as cidades foram apagadas da base de dados!!!");
			
		} catch (Exception e) {
			response.setMensagensRetorno(e.getMessage());			
		}		
		
		return ResponseEntity.ok(response);
		
	}
	
	

}
