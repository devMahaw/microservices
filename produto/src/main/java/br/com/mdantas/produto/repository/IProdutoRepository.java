package br.com.mdantas.produto.repository;

import br.com.mdantas.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author marcelo.dantas
 */

@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
