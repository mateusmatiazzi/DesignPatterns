public class ImpostoBaseadoEmMontante implements Imposto {

    @Override
    public double calcula(double montadeDeDinheiro) {
        if (montadeDeDinheiro <= 1000.0) {
            return montadeDeDinheiro * 1.5 / 100.0;
        }
        return montadeDeDinheiro * 4.5 / 100.0;
    }
}
