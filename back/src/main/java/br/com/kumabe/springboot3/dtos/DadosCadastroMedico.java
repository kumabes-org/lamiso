package br.com.kumabe.springboot3.dtos;

import br.com.kumabe.springboot3.enums.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
        DadosEndereco endereco) {
}
