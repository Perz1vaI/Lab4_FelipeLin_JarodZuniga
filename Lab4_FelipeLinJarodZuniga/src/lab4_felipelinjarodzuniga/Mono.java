package lab4_felipelinjarodzuniga;

public class Mono extends Primates implements Calculos {

    private String color_pelo;

    public Mono() {
    }

    public Mono(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public Mono(String color_pelo, int comida, int km_comida, String planeta, String LugarN) {
        super(comida, km_comida, planeta, LugarN);
        this.color_pelo = color_pelo;
    }

    public Mono(String color_pelo, int comida, int km_comida, String planeta, String LugarN, String nombre, String grupoS, String sexo, int altura, int peso) {
        super(comida, km_comida, planeta, LugarN, nombre, grupoS, sexo, altura, peso);
        this.color_pelo = color_pelo;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    @Override
    public String toString() {
        return "Mono{" + "color_pelo=" + color_pelo + '}';
    }

    @Override
    public int Comida(int distancia) {
        return comida - km_comida * distancia;
    }

    @Override
    public int Combustible(int distancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
