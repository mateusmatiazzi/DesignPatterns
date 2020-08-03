import org.junit.jupiter.api.Test;

public class FazedorDePizzaTeste {

    @Test
    public void deveFazerUmaPizzaTotalmenteAssada(){
        PizzaTotalmenteAssada pizzaTotalmenteAssada = new PizzaTotalmenteAssada();
        pizzaTotalmenteAssada.fazPizza();
    }

    @Test
    public void deveFazerUmaPizzaParcialmenteAssada(){
        PizzaParcialmenteAssada pizzaParcialmenteAssada = new PizzaParcialmenteAssada();
        pizzaParcialmenteAssada.fazPizza();
    }
}
