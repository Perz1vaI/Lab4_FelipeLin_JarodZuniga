package lab4_felipelinjarodzuniga;

public class SeresVivos {

    protected String nombre;
    protected String grupoS;
    protected String sexo;
    protected double altura;
    protected double peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String grupoS, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.grupoS = grupoS;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupoS() {
        return grupoS;
    }

    public void setGrupoS(String grupoS) {
        this.grupoS = grupoS;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", grupoS=" + grupoS + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    

}
