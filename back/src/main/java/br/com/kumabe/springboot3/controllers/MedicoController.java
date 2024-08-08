package br.com.kumabe.springboot3.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kumabe.springboot3.dtos.DadosCadastroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MedicoController.class);

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        LOGGER.info("{}", dados);
    }

}
