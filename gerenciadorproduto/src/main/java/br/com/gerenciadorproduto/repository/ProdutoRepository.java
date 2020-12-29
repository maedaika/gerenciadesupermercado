/**
 * 
 */
package br.com.gerenciadorproduto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import br.com.gerenciadorproduto.domain.Produto;

/**
 * @author alessandro.maeda
 *
 */
@Component("produtoRepository")
public interface ProdutoRepository extends CrudRepository<Produto, Integer > {

}
