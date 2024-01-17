public class Main {
    public static void main(String[] args) {
        Publicador publicador = new Publicador();
        AssinanteConcreto assinante1 = new AssinanteConcreto(publicador);
        AssinanteConcreto assinante2 = new AssinanteConcreto(publicador);
        
        publicador.notificarAssinantes();
    }
}
