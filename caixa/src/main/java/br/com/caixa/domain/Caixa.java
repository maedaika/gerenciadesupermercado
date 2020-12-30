package br.com.caixa.domain;

import java.util.Date;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;






@Table(name="TBL_CAIXA")
@SequenceGenerator(name="tbl_cidade_id_cidade_seq", sequenceName="tbl_cidade_id_cidade_seq",initialValue=1, allocationSize=1)
public class Caixa {
	
	private Integer idCaixa;
	
	
	private Integer idProduto;
	
	private Date dtVenda;
	
	
	

	public Integer getIdCaixa() {
		return idCaixa;
	}

	public void setIdCaixa(Integer idCaixa) {
		this.idCaixa = idCaixa;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Date getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(Date dtVenda) {
		this.dtVenda = dtVenda;
	}

	@Override
	public String toString() {
		return "Caixa [idCaixa=" + idCaixa + ", idProduto=" + idProduto + ", dtVenda=" + dtVenda + "]";
	}
	
	
	

}
