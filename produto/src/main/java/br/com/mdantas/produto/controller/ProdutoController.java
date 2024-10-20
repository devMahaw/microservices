package br.com.mdantas.produto.controller;

import br.com.mdantas.produto.model.Produto;
import br.com.mdantas.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author marcelo.dantas
 */

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> listar() {
        return service.listarProdutos();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id) {
        return service.buscarProdutoPorId(id);
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return service.salvarProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return service.salvarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarProduto(id);
    }
}
