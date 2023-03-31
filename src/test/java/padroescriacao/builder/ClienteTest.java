package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBuilderTest {

    @Test
    void deveRetornarExcecaoParaClienteSemMatricula() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("Cliente 1")
                    .setEmail("cliente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Identificação inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaClienteSemNome() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setIdentificacao(1)
                    .setEmail("cliente1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }


    @Test
    void deveRetornarClienteValido() {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder
                .setIdentificacao(1)
                .setNome("Cliente 1")
                .setEmail("cliente1@email.com")
                .build();

        assertNotNull(cliente);
    }
}