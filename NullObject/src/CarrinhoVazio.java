import java.util.List;

public class CarrinhoVazio extends Carrinho {
    String nomeDoCliente = "";
    List<String> listaDeProdutos = null;

    @Override
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    @Override
    public List<String> getListaDeProdutos() {
        return listaDeProdutos;
    }
}
