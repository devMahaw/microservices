package br.com.mdantas.produto.service;

import br.com.mdantas.produto.model.Produto;
import br.com.mdantas.produto.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author marcelo.dantas
 */

@Service
public class ProdutoService {

    @Autowired
    private IProdutoRepository repository;

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public Produto buscarProdutoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Produto salvarProduto(Produto produto) {
        return repository.save(produto);
    }

    public void deletarProduto(Long id) {
        repository.deleteById(id);
    }
}
