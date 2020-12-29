/**
 * 
 */
package br.com.gerenciadorproduto.BO;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import br.com.gerenciadorproduto.domain.Produto;
import br.com.gerenciadorproduto.exception.BDException;
import br.com.gerenciadorproduto.repository.ProdutoRepository;

/**
 * @author alessandro.maeda
 *
 */

@Component("produtoBO")
@Configuration
@ComponentScan("br.com.gerenciadorproduto")
public class ProdutoBO implements IProdutoBO {

	
	@Autowired
	ProdutoRepository produtoRepository;	

	
	@Override
	public Produto cadastraProduto(Produto produto) throws BDException {
		// TODO Auto-generated method stub
		Produto produtoRetornaPersit = null;
		try {
			produtoRetornaPersit = produtoRepository.save(produto);
		} catch (Exception e) {
			// TODO: handle exception
			throw new BDException(e.getMessage());
		}
		return produtoRetornaPersit;
	}

	@Override
	public void deleteTodasProdutos() throws BDException {
		// TODO Auto-generated method stub
		try {
			produtoRepository.deleteAll();
		} catch (Exception e) {
			// TODO: handle exception
			throw new BDException(e.getMessage());
		}
	}

	@Override
	public ArrayList<Produto> buscaTodasProdutos() throws BDException {
		// TODO Auto-generated method stub
		ArrayList<Produto> todosProdutos = new ArrayList<Produto>();
		
		try {
			todosProdutos = (ArrayList<Produto>) produtoRepository.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			throw new BDException(e.getMessage());
		}
		return todosProdutos;
	}

	@Override
	public void deletaProduto(Integer idproduto) throws BDException {
		// TODO Auto-generated method stub
		//Produto cidadeRetornoDeleta = null;
		try {
			produtoRepository.deleteById(idproduto);
		} catch (Exception e) {
			// TODO: handle exception
			throw new BDException(e.getMessage());
		}
	}

	@Override
	public void recebeProduto(Produto produto) throws BDException {
		// TODO Auto-generated method stub
				//Produto cidadeRetornoDeleta = null;
				try {
					produtoRepository.delete(produto);
				} catch (Exception e) {
					// TODO: handle exception
					throw new BDException(e.getMessage());
				}
			}
	

}
