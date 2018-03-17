package beans;

import javax.ejb.Stateless;

@Stateless
public class LetraNota implements ConversorStrategy {

    @Override
    public String convierteNota(String evaluacion, String... comentario) {
        return evaluacion.equals("F") ? "No apto" : evaluacion.equals("E") ? "No apto" : "Apto";

    }
}
