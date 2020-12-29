package br.com.caixa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Table(name="TBL_CAIXA")

@SequenceGenerator(name="tbl_caixa_idcaixa_seq", sequenceName="tbl_caixa_idcaixa_seq",initialValue=1, allocationSize=1)
@Entity

public class Caixa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tbl_caixa_idcaixa_seq")
	@Column(name="id_caixa")
    private Integer idCaixa;
	
	@Column(name="tbl_produto_idproduto")
	private Integer idProduto;
	
	@Column(name="tbl_pessoal_idpessoa")
	private Integer idPessoa;
	
	@Column(name="dtvenda")
	private Date dtVenda;
	
	public Caixa() {
		super();
		
	}
	
	public Caixa(Integer idCaixa, Integer idProduto, Integer idPessoa, Date dtVenda) {
		super();
		this.idCaixa = idCaixa;
		this.idProduto = idProduto;
		this.idPessoa = idPessoa;
		this.dtVenda = dtVenda;
	}
	
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

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Date getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(Date dtVenda) {
		this.dtVenda = dtVenda;
	}
	
	@Override
	public String toString() {
		return "Caixa [idCaixa=" + idCaixa + ", idProduto=" + idProduto + ", idPessoa=" + idPessoa + ", dtVenda="
				+ dtVenda + "]";

				
    }

}
