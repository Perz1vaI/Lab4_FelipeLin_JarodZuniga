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
public class Cohete extends Espacial{
    protected int separaciones;

    public Cohete() {
    }

    public int getSeparaciones() {
        return separaciones;
    }

    public void setSeparaciones(int separaciones) {
        this.separaciones = separaciones;
    }

    public String getTipo_combbust() {
        return tipo_combbust;
    }

    public void setTipo_combbust(String tipo_combbust) {
        this.tipo_combbust = tipo_combbust;
    }

    public String getPlan_part() {
        return plan_part;
    }

    public void setPlan_part(String plan_part) {
        this.plan_part = plan_part;
    }

    public String getPlan_lleg() {
        return plan_lleg;
    }

    public void setPlan_lleg(String plan_lleg) {
        this.plan_lleg = plan_lleg;
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
        return "Cohete{" + "separaciones=" + separaciones + '}';
    }
    
}
