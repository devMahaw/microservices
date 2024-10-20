package br.com.mdantas.produto.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author marcelo.dantas
 */

@Data
@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;
}
