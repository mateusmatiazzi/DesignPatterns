import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeImpostoTeste {

    CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

    @Test
    void deveRetornarImpostoBaseadoEmMontante() {
        calculadoraDeImposto.setTipoDeImposto(new ImpostoBaseadoEmMontante());
        double esperado = 1000*1.50/100;
        double atual;

        atual = calculadoraDeImposto.retornaImpostoTotalASerDebitadoDoMontante(1000);

        assertEquals(esperado, atual);
    }

    @Test
    void deveRetornarImpostoBaseadoEmValorFixo() {
        calculadoraDeImposto.setTipoDeImposto(new ImpostoBaseadoValorFixo());
        double esperado = 10.5;
        double atual;

        atual = calculadoraDeImposto.retornaImpostoTotalASerDebitadoDoMontante(1000);

        assertEquals(esperado, atual);
    }
}