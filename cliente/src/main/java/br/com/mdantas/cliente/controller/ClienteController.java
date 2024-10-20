package br.com.mdantas.cliente.controller;

import br.com.mdantas.cliente.model.Cliente;
import br.com.mdantas.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author marcelo.dantas
 */

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listar() { return service.listarClientes(); }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) { return service.buscarClientePorId(id); }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) { return service.salvarCliente(cliente); }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return service.salvarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletarCliente(id); }
}
