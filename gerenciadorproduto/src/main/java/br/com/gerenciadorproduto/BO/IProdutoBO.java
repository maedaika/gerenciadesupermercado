/**
 * 
 */
package br.com.gerenciadorproduto.BO;

import java.util.ArrayList;

import br.com.gerenciadorproduto.domain.Produto;
import br.com.gerenciadorproduto.exception.BDException;

/**
 * @author alessandro.maeda
 *
 */
public interface IProdutoBO {
	
	public Produto cadastraProduto(Produto produto) throws BDException;
	
	public void deleteTodasProdutos() throws BDException;	
	
	public ArrayList<Produto> buscaTodasProdutos() throws BDException;
	
	public void deletaProduto(Integer idproduto )throws BDException;
	
	public void recebeProduto(Produto produto)throws BDException;

}
