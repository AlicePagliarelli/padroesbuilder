package padroescriacao.builder;

import java.util.Date;

public class ClienteBuilder {

    private Cliente cliente;

    public ClienteBuilder() {
        cliente = new Cliente();
    }

    public Cliente build() {
        if (cliente.getIdentificacao() == 0) {
            throw new IllegalArgumentException("Identificação inválida");
        }
        if (cliente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return cliente;
    }

    public ClienteBuilder setIdentificacao(int identificacao) {
        cliente.setIdentificacao(identificacao);
        return this;
    }

    public ClienteBuilder setNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder setDataNascimento(Date dataNascimento) {
        cliente.setDataNascimento(dataNascimento);
        return this;
    }

    public ClienteBuilder setNomeMae(String nomeMae) {
        cliente.setNomeMae(nomeMae);
        return this;
    }

    public ClienteBuilder setNomePai(String nomePai) {
        cliente.setNomePai(nomePai);
        return this;
    }

    public ClienteBuilder setCpf(String cpf) {
        cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder setRg(String rg) {
        cliente.setRg(rg);
        return this;
    }

    public ClienteBuilder setPedidoAnterior(String pedidoAnterior) {
        cliente.setPedidoAnterior(pedidoAnterior);
        return this;
    }

    public ClienteBuilder setPedidoLogradouro(String enderecoLogradouro) {
        cliente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ClienteBuilder setEnderecoNumero(int enderecoNumero) {
        cliente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ClienteBuilder setEnderecoComplemento(String enderecoComplemento) {
        cliente.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public ClienteBuilder setEnderecoBairro(String enderecoBairro) {
        cliente.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public ClienteBuilder setEnderecoCidade(String enderecoCidade) {
        cliente.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public ClienteBuilder setEnderecoUF(String enderecoUF) {
        cliente.setEnderecoUF(enderecoUF);
        return this;
    }

    public ClienteBuilder setCep(String cep) {
        cliente.setCep(cep);
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        cliente.setEmail(email);
        return this;
    }

    public ClienteBuilder setCelular(String celular) {
        cliente.setCelular(celular);
        return this;
    }

}
