package br.com.gerenciadorproduto.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="tbl_produto")
//sequencia criada automaticamente
@SequenceGenerator(name="tbl_produto_idproduto_seq", sequenceName="tbl_produto_idproduto_seq",initialValue=1, allocationSize=1)
@Entity
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * INSERT INTO supermecado.tbl_produto ("idTipoProduto", "dcNome", "dcMarca",
	 * "dtDalidade", "dtFabricacao", descricao, codigo_barra, origem, valor)
	 * VALUES(0, '', '', '', '', '', '', '', '');
	 */

//Sequence referenciando ao a chave da tabela, coluna IDPRODUTO
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tbl_produto_idproduto_seq")
	@Column(name="idProduto")
	private Integer idProduto;
	
	@Column(name="dcNome")
	private String dcNome;

	@Column(name="dcMarca")
	private String dcMarca;
	
	@Column(name="dtValidade")
	private Date dtValidade;
	
	@Column(name="dtFabricacao")
	private Date dtFabricacao;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="codigoBarra")
	private String codigoBarra;
	
	@Column(name="origem")
	private String origem;
	
	@Column(name="valor")
	private String valor;
	
	@Column(name="idTipoProduto")
	private Integer idTipoProduto;
	

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
		return idTipoProduto;
	}
	public void setTblTipoProdutoIdTipoProduto(Integer tblTipoProdutoIdTipoProduto) {
		this.idTipoProduto = tblTipoProdutoIdTipoProduto;
	}
	
	// TODO Auto-generated constructor stub
	public Produto() {
		super();
	
	}

	// TODO Auto-generated constructor stub
	public Produto(Integer tblTipoProdutoIdTipoProduto, Integer idProduto, String dcNome, String dcMarca,
			Date dtValidade, Date dtFabricacao, String descricao, String codigoBarra, String origem, String valor) {
		super();
		this.idTipoProduto = tblTipoProdutoIdTipoProduto;
		this.idProduto = idProduto;
		this.dcNome = dcNome;
		this.dcMarca = dcMarca;
		this.dtValidade = dtValidade;
		this.dtFabricacao = dtFabricacao;
		this.descricao = descricao;
		this.codigoBarra = codigoBarra;
		this.origem = origem;
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Produto [tblTipoProdutoIdTipoProduto=" + idTipoProduto + ", idProduto=" + idProduto
				+ ", dcNome=" + dcNome + ", dcMarca=" + dcMarca + ", dtValidade=" + dtValidade + ", dtFabricacao="
				+ dtFabricacao + ", descricao=" + descricao + ", codigoBarra=" + codigoBarra + ", origem=" + origem
				+ ", valor=" + valor + "]";
	}
	

}
