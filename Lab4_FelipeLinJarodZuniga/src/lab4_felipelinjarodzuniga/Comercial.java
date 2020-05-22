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
public class Comercial extends Aero_normal{
    protected int num_pas;
    protected boolean piloto_aut;

    public Comercial() {
    }

    public Comercial(int num_pas, boolean piloto_aut) {
        this.num_pas = num_pas;
        this.piloto_aut = piloto_aut;
    }

    public int getNum_pas() {
        return num_pas;
    }

    public void setNum_pas(int num_pas) {
        this.num_pas = num_pas;
    }

    public boolean isPiloto_aut() {
        return piloto_aut;
    }

    public void setPiloto_aut(boolean piloto_aut) {
        this.piloto_aut = piloto_aut;
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
        return "Comercial{" + "num_pas=" + num_pas + ", piloto_aut=" + piloto_aut + '}';
    }
    
    
}
