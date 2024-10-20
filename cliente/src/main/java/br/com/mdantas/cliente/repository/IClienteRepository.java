package br.com.mdantas.cliente.repository;

import br.com.mdantas.cliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author marcelo.dantas
 */

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
