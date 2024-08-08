package br.com.kumabe.lamiso.dtos;

public record DadosEndereco(
        String logradouro, String bairro,
        String cep, String cidade,
        String uf, String complemento,
        String numero) {

}
