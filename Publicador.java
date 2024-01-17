import java.util.ArrayList;
import java.util.List;

public class Publicador {
       private List<Assinante> assinantes = new ArrayList<>();

    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    public void notificarAssinantes() {
        for (Assinante assinante : assinantes) {
            assinante.atualizar();
        }
    }
}
