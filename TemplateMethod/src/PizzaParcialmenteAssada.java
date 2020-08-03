public class PizzaParcialmenteAssada extends FazedorDePizza{
    @Override
    protected void terminarDeAssar() {

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
