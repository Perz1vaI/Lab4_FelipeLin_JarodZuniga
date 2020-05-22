package lab4_felipelinjarodzuniga;

public class Gorilla extends Primates {

    private int IQ;

    public Gorilla() {
    }

    public Gorilla(int IQ) {
        setIQ(IQ);
    }

    public Gorilla(int IQ, int comida, int km_comida, String planeta, String LugarN) {
        super(comida, km_comida, planeta, LugarN);
        setIQ(IQ);
    }

    public Gorilla(int IQ, int comida, int km_comida, String planeta, String LugarN, String nombre, String grupoS, String sexo, int altura, int peso) {
        super(comida, km_comida, planeta, LugarN, nombre, grupoS, sexo, altura, peso);
        setIQ(IQ);
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        if (IQ < 130 && IQ > 139) {
            System.out.println("ese valor esta incorrecto");
        } else {
            this.IQ = IQ;
        }
    }

    @Override
    public String toString() {
        return "Gorilla{" + "IQ=" + IQ + '}';
    }
    
    

}
