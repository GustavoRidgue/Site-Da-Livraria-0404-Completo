package br.com.sistema_eventos.controller;


import br.com.sistema_eventos.model.eventosModel;
import br.com.sistema_eventos.service.eventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;


@Controller
public class eventoController {

    @Autowired
    private eventosService service;
    @GetMapping
    public  String mostrarHome(){return "index";}

    @PostMapping("/cadastrar")
    public String cadastrarEventos (eventosModel eventos){
        service.cadastrarEvento(eventos);
        return "index";
    }
}