package lab4_felipelinjarodzuniga;

public class SeresVivos {

    protected String nombre;
    protected String grupoS;
    protected String sexo;
    protected int altura;
    protected int peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String grupoS, String sexo, int altura, int peso) {
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", grupoS=" + grupoS + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    

}
