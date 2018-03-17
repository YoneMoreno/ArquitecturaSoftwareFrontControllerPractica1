package beans;

import javax.ejb.Stateless;

@Stateless
public class ComentarioNota implements ConversorStrategy {

    @Override
    public String convierteNota(String evaluacion, String... comentario) {
        if (evaluacion.trim().equals("Apto") && comentario != null && comentario[0].length() > 5) {
            return "Apto";
        } else {
            return "No Apto";
        }
    }
}
