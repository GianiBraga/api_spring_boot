package com.ideau.api.repositorio;

import java.util.List;

// Importações relacionadas ao Spring Framework e JPA
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Importação do modelo Pessoa
import com.ideau.api.modelo.Pessoa;

// Repositório Spring que estende CrudRepository para a entidade Pessoa
@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

    // Método para encontrar todas as pessoas
    List<Pessoa> findAll();

    // Método para encontrar uma pessoa pelo código
    Pessoa findByCodigo(int codigo);

    // Método para encontrar todas as pessoas ordenadas pelo nome
    List<Pessoa> findByOrderByNome();

    // Método para encontrar pessoas com um nome específico e ordenadas por idade
    List<Pessoa> findByNomeOrderByIdade(String nome);

    // Método para encontrar pessoas cujo nome contém um termo específico
    List<Pessoa> findByNomeContaining(String termo);

    // Método para encontrar pessoas cujo nome começa com um termo específico
    List<Pessoa> findByNomeStartsWith(String termo);

    // Método para encontrar pessoas cujo nome termina com um termo específico
    List<Pessoa> findByNomeEndsWith(String termo);

    // Query nativa para calcular a soma das idades de todas as pessoas
    @Query(value = "SELECT SUM(idade) FROM pessoas", nativeQuery = true)
    int somaIdades();

    // Query nativa para encontrar pessoas com idade maior ou igual a um valor
    // específico
    @Query(value = "SELECT * FROM pessoas WHERE idade >= :idade", nativeQuery = true)
    List<Pessoa> idadeMaiorIgual(int idade);

    // Método para contar o número de registros com um código específico
    int countByCodigo(int codigo);

}
