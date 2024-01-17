public class AssinanteConcreto implements Assinante {
    private Publicador publicador;

    public AssinanteConcreto(Publicador publicador) {
        this.publicador = publicador;
        publicador.adicionarAssinante(this);
    }

    @Override
    public void atualizar() {
        System.out.println("Estado do publicador alterado. Atualizando assinante.");
    }
}