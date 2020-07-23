import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTeste {

    @Test
    void deveTestarUmCarrinhoComUmDono() {
        Carrinho carrinho = new Carrinho();
        String nomeEsperadoParaOUsuario = "Mateus";
        String nomeRecebidoDoCarrinho;

        carrinho.setNomeDoCliente("Mateus");
        nomeRecebidoDoCarrinho = carrinho.getNomeDoCliente();

        assertEquals(nomeEsperadoParaOUsuario, nomeRecebidoDoCarrinho);
    }

    @Test
    void deveTestarUmCarrinhoSemDono() {
        Carrinho carrinho = new CarrinhoVazio();
        String nomeEsperadoParaOUsuario = "";

        assertEquals(nomeEsperadoParaOUsuario, carrinho.getNomeDoCliente());
        assertNull(carrinho.getListaDeProdutos());
    }
}
