package br.com.kumabe.lamiso.dtos;

import br.com.kumabe.lamiso.enums.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
        DadosEndereco endereco) {
}
