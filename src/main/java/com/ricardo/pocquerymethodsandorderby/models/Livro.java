package com.ricardo.pocquerymethodsandorderby.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name ="tb_livro")
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String editora;
    private Integer publicacao;
    private String autor;

    public Livro (){}
    public Livro(Long id, String nome, String editora, Integer publicacao, String autor) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
        this.publicacao = publicacao;
        this.autor = autor;
    }
}
