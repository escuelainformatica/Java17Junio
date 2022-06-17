package cl.escuelainformatica.junio17.servicio;

import cl.escuelainformatica.junio17.modelo.Encomienda;

public class EncomiendaServicio {

    public int calculo(Encomienda enc) {
        int resultado=0;
        resultado=enc.getAlto()*enc.getAncho()* enc.getLargo()*enc.getPeso()*5;

        return resultado;
    }
    public boolean redireccion(Encomienda enc,String nuevoDestino) {
        boolean resultado=true;
        enc.setDestino(nuevoDestino);
        return resultado;
    }
    public int calculoCarta(Encomienda enc) {
        int resultado=0;
        resultado=enc.getAlto()*enc.getLargo()*2;
        return resultado;
    }


}
