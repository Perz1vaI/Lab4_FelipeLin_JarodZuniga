/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_felipelinjarodzuniga;

import java.util.ArrayList;

/**
 *
 * @author Jhon Zuniga
 */
public class Aero_normal extends Transporte{
    protected String tipogas;
    protected String destino;
    protected String partida;

    public Aero_normal(String tipogas, String destino, String partida) {
        this.tipogas = tipogas;
        this.destino = destino;
        this.partida = partida;
    }

    public Aero_normal(String tipogas, String destino, String partida, int cant_conm, double dis_tan, double altitud, ArrayList primates) {
        super(cant_conm, dis_tan, altitud, primates);
        this.tipogas = tipogas;
        this.destino = destino;
        this.partida = partida;
    }

    public Aero_normal() {
    }

    public String getTipogas() {
        return tipogas;
    }

    public void setTipogas(String tipogas) {
        this.tipogas = tipogas;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public int getCant_conm() {
        return cant_conm;
    }

    public void setCant_conm(int cant_conm) {
        this.cant_conm = cant_conm;
    }

    public double getDis_tan() {
        return dis_tan;
    }

    public void setDis_tan(double dis_tan) {
        this.dis_tan = dis_tan;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public ArrayList getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "Aero_normal{" + "tipogas=" + tipogas + ", destino=" + destino + ", partida=" + partida + '}';
    }
    
    
}
