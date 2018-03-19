/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateful;

/**
 *
 * @author YonePC
 */
 @Stateful
public class Cuestionario {

    String pregunta1, respuestaTexto11, respuestaVerdad11, respuestaTexto12, respuestaVerdad12,
            respuestaTexto13, respuestaVerdad13;

    public Cuestionario() {
    }

    public Cuestionario(String pregunta1, String respuestaTexto11, String respuestaVerdad11, String respuestaTexto12, String respuestaVerdad12, String respuestaTexto13, String respuestaVerdad13) {
        this.pregunta1 = pregunta1;
        this.respuestaTexto11 = respuestaTexto11;
        this.respuestaVerdad11 = respuestaVerdad11;
        this.respuestaTexto12 = respuestaTexto12;
        this.respuestaVerdad12 = respuestaVerdad12;
        this.respuestaTexto13 = respuestaTexto13;
        this.respuestaVerdad13 = respuestaVerdad13;
    }

        public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public String getRespuestaTexto11() {
        return respuestaTexto11;
    }

    public void setRespuestaTexto11(String respuestaTexto11) {
        this.respuestaTexto11 = respuestaTexto11;
    }

    public String getRespuestaVerdad11() {
        return respuestaVerdad11;
    }

    public void setRespuestaVerdad11(String respuestaVerdad11) {
        this.respuestaVerdad11 = respuestaVerdad11;
    }

    public String getRespuestaTexto12() {
        return respuestaTexto12;
    }

    public void setRespuestaTexto12(String respuestaTexto12) {
        this.respuestaTexto12 = respuestaTexto12;
    }

    public String getRespuestaVerdad12() {
        return respuestaVerdad12;
    }

    public void setRespuestaVerdad12(String respuestaVerdad12) {
        this.respuestaVerdad12 = respuestaVerdad12;
    }

    public String getRespuestaTexto13() {
        return respuestaTexto13;
    }

    public void setRespuestaTexto13(String respuestaTexto13) {
        this.respuestaTexto13 = respuestaTexto13;
    }

    public String getRespuestaVerdad13() {
        return respuestaVerdad13;
    }

    public void setRespuestaVerdad13(String respuestaVerdad13) {
        this.respuestaVerdad13 = respuestaVerdad13;
    }

}
