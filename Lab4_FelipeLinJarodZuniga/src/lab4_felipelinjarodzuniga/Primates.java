package lab4_felipelinjarodzuniga;

public class Primates extends SeresVivos {

    protected int comida;
    protected int km_comida;
    protected String planeta;
    protected String LugarN;

    public Primates() {
    }

    public Primates(int comida, int km_comida, String planeta, String LugarN) {
        this.comida = comida;
        this.km_comida = km_comida;
        this.planeta = planeta;
        this.LugarN = LugarN;
    }

    public Primates(int comida, int km_comida, String planeta, String LugarN, String nombre, String grupoS, String sexo, int altura, int peso) {
        super(nombre, grupoS, sexo, altura, peso);
        this.comida = comida;
        this.km_comida = km_comida;
        this.planeta = planeta;
        this.LugarN = LugarN;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getKm_comida() {
        return km_comida;
    }

    public void setKm_comida(int km_comida) {
        this.km_comida = km_comida;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getLugarN() {
        return LugarN;
    }

    public void setLugarN(String LugarN) {
        this.LugarN = LugarN;
    }

    @Override
    public String toString() {
        return "Primates{" + "comida=" + comida + ", km_comida=" + km_comida + ", planeta=" + planeta + ", LugarN=" + LugarN + '}';
    }
    
    
  

}
