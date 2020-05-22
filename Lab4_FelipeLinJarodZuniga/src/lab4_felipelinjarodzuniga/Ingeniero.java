package lab4_felipelinjarodzuniga;

import java.util.ArrayList;

public class Ingeniero extends SeresVivos {

    private String correo;
    private String usuario;
    private ArrayList<String> idiomas = new ArrayList();
    private String contra;
    private String fechaN;

    public Ingeniero() {
    }

    public Ingeniero(String correo, String usuario, String contra, String fechaN) {
        this.correo = correo;
        this.usuario = usuario;
        this.contra = contra;
        this.fechaN = fechaN;
    }

    public Ingeniero(String correo, String usuario, String contra, String fechaN, String nombre, String grupoS, String sexo, double altura, double peso) {
        super(nombre, grupoS, sexo, altura, peso);
        this.correo = correo;
        this.usuario = usuario;
        this.contra = contra;
        this.fechaN = fechaN;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Ingeniero{" + "correo=" + correo + ", usuario=" + usuario + ", idiomas=" + idiomas + ", contra=" + contra + ", fechaN=" + fechaN + " ";
    }

}
