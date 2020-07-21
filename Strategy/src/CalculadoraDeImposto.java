public class CalculadoraDeImposto {

    private Imposto tipoDeImposto;

    public CalculadoraDeImposto() {
    }

    public double retornaImpostoTotalASerDebitadoDoMontante(double montanteDeDinheiro) {
        return tipoDeImposto.calcula(montanteDeDinheiro);
    }

    public Imposto getTipoDeImposto() {
        return tipoDeImposto;
    }

    public void setTipoDeImposto(Imposto tipoDeImposto) {
        this.tipoDeImposto = tipoDeImposto;
    }

}
