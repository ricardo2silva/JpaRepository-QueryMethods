package com.ricardo.pocquerymethodsandorderby.repositories;

import com.ricardo.pocquerymethodsandorderby.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
     // buscando todos os livros e ordenando por publicação
     List<Livro> findByOrderByPublicacao();

     // ordenando por publicacao e nome
     List<Livro> findByOrderByNomeAscPublicacaoAsc();


}
