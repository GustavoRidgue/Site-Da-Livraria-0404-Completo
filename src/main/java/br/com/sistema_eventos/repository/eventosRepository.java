package br.com.sistema_eventos.repository;

import br.com.sistema_eventos.model.eventosModel;
import org.springframework.data.repository.CrudRepository;

public interface eventosRepository extends CrudRepository<eventosModel, String> {
}
