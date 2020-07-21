public class ImpostoBaseadoValorFixo implements Imposto {
    @Override
    public double calcula(double montadeDeDinheiro) {
        if (montadeDeDinheiro <= 1000) {
            return 10.5;
        }
        return 36.6;
    }
}
