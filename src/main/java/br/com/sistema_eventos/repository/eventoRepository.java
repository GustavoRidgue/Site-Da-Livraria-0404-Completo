package br.com.sistema_eventos.repository;

import br.com.sistema_eventos.model.eventoModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface eventoRepository extends CrudRepository<eventoModel, Integer> {
    Optional<eventoModel> findByNome(String nome);


}
