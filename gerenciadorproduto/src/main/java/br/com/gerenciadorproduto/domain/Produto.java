package br.com.gerenciadorproduto.domain;

import java.util.Date;

public class Produto {
	private Integer tblTipoProdutoIdTipoProduto;
	private Integer idProduto;
	private String dcNome;
	private String dcMarca;
	private Date dtValidade;
	private Date dtFabricacao;
	private String descricao;
	private String codigoBarra;
	private String origem;
	private String valor;
	
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getDcNome() {
		return dcNome;
	}
	public void setDcNome(String dcNome) {
		this.dcNome = dcNome;
	}
	public String getDcMarca() {
		return dcMarca;
	}
	public void setDcMarca(String dcMarca) {
		this.dcMarca = dcMarca;
	}
	public Date getDtValidade() {
		return dtValidade;
	}
	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}
	public Date getDtFabricacao() {
		return dtFabricacao;
	}
	public void setDtFabricacao(Date dtFabricacao) {
		this.dtFabricacao = dtFabricacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Integer getTblTipoProdutoIdTipoProduto() {
		return tblTipoProdutoIdTipoProduto;
	}
	public void setTblTipoProdutoIdTipoProduto(Integer tblTipoProdutoIdTipoProduto) {
		this.tblTipoProdutoIdTipoProduto = tblTipoProdutoIdTipoProduto;
	}
	

}
