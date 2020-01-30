package br.com.sistema_eventos.service;

import br.com.sistema_eventos.model.eventoModel;
import br.com.sistema_eventos.repository.eventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class eventoService {

    @Autowired
    private eventoRepository repository;

    public eventoModel cadastrarEvento(eventoModel evento) {
        evento.setAtivo(Boolean.TRUE);
        evento.setDataCriacao(LocalDate.now());
        return repository.save(evento);
    }

    public Iterable<eventoModel> listarEventos(){
        return repository.findAll();
    }

    public eventoModel listarEvento(String nome){
        Optional<eventoModel> evento = repository.findByNome(nome);
        if (evento.isPresent()){
            return evento.get();
        }
        return null;
    }

}

