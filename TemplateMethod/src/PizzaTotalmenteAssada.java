public class PizzaTotalmenteAssada extends FazedorDePizza {
    @Override
    protected void terminarDeAssar() {
        System.out.println("Terminando de assar a pizza");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando Condimentos");
    }

    @Override
    protected void preAssar() {
        System.out.println("Pre-assando a pizza");
    }
}
