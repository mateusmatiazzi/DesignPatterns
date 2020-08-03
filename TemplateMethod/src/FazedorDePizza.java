public abstract class FazedorDePizza {
    public void fazPizza() {
        abrirAMassa();
        preAssar();
        adicionarCondimentos();
        terminarDeAssar();
        cortar();
    }

    protected abstract void terminarDeAssar();

    protected abstract void adicionarCondimentos();

    protected abstract void preAssar();

    private void abrirAMassa(){
        System.out.println("Abrindo massa da pizza");
    }

    private void cortar(){
        System.out.println("Cortando pizza");
    }
}
