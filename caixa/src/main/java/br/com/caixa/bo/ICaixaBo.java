package br.com.caixa.bo;

import java.util.ArrayList;


import br.com.caixa.domain.Caixa;
import br.com.caixa.exception.BDException;

public interface ICaixaBo {
	
	public Caixa cadastraCaixa(Caixa caixa) throws BDException;
	
	public void deleteTodasCaixas() throws BDException;
	
	public ArrayList<Caixa> buscaTodasCaixas() throws BDException;
	
	public void deleteCaixa(Integer idCaixa) throws BDException;
	
	public void deleteCaixaObjeto(Caixa caixa) throws BDException;
	
	

}
