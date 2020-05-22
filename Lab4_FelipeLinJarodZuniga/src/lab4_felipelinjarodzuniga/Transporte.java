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
public class Transporte {
    protected int cant_conm;
    protected double dis_tan;
    protected double altitud;
    protected ArrayList<Primates> primates;

    public Transporte() {
    }

    public Transporte(int cant_conm, double dis_tan, double altitud, ArrayList primates) {
        this.cant_conm = cant_conm;
        this.dis_tan = dis_tan;
        this.altitud = altitud;
        this.primates = primates;
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

    public ArrayList<Primates> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primates> primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "Transporte{" + "cant_conm=" + cant_conm + ", dis_tan=" + dis_tan + ", altitud=" + altitud + ", primates=" + primates + '}';
    }
    
    
}
