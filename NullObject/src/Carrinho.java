import java.util.List;

public class Carrinho {
    String nomeDoCliente;
    List<String> listaDeProdutos;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public List<String> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<String> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
