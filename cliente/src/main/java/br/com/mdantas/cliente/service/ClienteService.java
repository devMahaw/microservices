package br.com.mdantas.cliente.service;

import br.com.mdantas.cliente.model.Cliente;
import br.com.mdantas.cliente.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author marcelo.dantas
 */

@Service
public class ClienteService {
    @Autowired
    private IClienteRepository repository;

    public List<Cliente> listarClientes() { return repository.findAll(); }
    public Cliente buscarClientePorId(Long id) { return repository.findById(id).orElse(null); }
    public Cliente salvarCliente(Cliente cliente) { return repository.save(cliente); }
    public void deletarCliente(Long id) { repository.deleteById(id); }
}
