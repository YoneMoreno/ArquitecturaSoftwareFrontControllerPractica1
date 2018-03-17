package beans;

import javax.ejb.Stateless;

@Stateless
public class ConviertePuntosNota implements ConversorStrategy {

    @Override
    public String convierteNota(String evaluacion, String... comentario) {
        return Integer.parseInt(evaluacion) >= 5 ? "Apto" : "No apto";
    }
}
