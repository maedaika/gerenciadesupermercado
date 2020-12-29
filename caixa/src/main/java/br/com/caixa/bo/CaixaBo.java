package br.com.caixa.bo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import br.com.caixa.domain.Caixa;
import br.com.caixa.exception.BDException;
import br.com.caixa.repository.CaixaRepository;

@Component("caixaBo")
@Configuration
@ComponentScan("com.vindixit.foton.supporttables")
public class CaixaBo implements ICaixaBo{
	
	@Autowired
	CaixaRepository caixaRepository;	

	@Override
	public Caixa cadastraCaixa(Caixa caixa) throws BDException {
		
		Caixa caixaRetorno=null;
	
		try {
			caixaRetorno=caixaRepository.save(caixa);
						
         } catch (Exception e) {
			throw new BDException(e.getMessage());
		
		}
			
		return caixaRetorno;
	}

	@Override
	public void deleteTodasCaixas() throws BDException {
		try {
			caixaRepository.deleteAll();
		} catch (Exception e) {
			throw new BDException(e.getMessage());
		}
		
	}

	@Override
	public ArrayList<Caixa> buscaTodasCaixas() throws BDException {

		ArrayList<Caixa> buscaTodasCaixasdoBanco =  new ArrayList<Caixa>();
		
		try {
			buscaTodasCaixasdoBanco = (ArrayList<Caixa>) caixaRepository.findAll();			
		} catch (Exception e) {
			throw new BDException(e.getMessage());			
		}		
		
		return buscaTodasCaixasdoBanco;
		
	}

	@Override
	public void deleteCaixa(Integer idCaixa) throws BDException {
		try {
			caixaRepository.deleteById(idCaixa);
		} catch (Exception e) {
			throw new BDException(e.getMessage());
		}
		
	}

	@Override
	public void deleteCaixaObjeto(Caixa caixa) throws BDException {
		try {
			caixaRepository.delete(caixa);
		} catch (Exception e) {
			throw new BDException(e.getMessage());
		}
		
	}

}
