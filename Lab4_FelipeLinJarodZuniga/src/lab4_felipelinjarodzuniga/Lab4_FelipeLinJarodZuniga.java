package lab4_felipelinjarodzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_FelipeLinJarodZuniga {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ingeniero> inges= new ArrayList();
        int menu=0;
        while (menu != 3) {
        System.out.println("1. Login\n2. Sign in\n3. Cancelar");
         menu= sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Ingresar ");
                    System.out.println("");
                    System.out.println("Ingeniero ingrese su usuario");
                    String us=sc.next();
                    System.out.println("Ingeniero ingrese su contraseña");
                    String ps=sc.next();
                    for (int i = 0; i <= inges.size(); i++) {
                         if (us.equals(inges.get(i).getUsuario())) {
                             if (ps.equals(inges.get(i).getContra())) {
                                 System.out.println("Bienvenido ingniero "+ us+ " ");
                                 break;
                             }else{
                                 System.out.println("Contraseña Incorrecta");
                             }
                    }else{
                             System.out.println("Uuario no existente porfavor registrese");
                         }
                    }
                   
                    break;
                
                case 2:
                    String nam,sex,corr,usu,conta,nac,grupS;
                    ArrayList idio=new ArrayList();
                    double peso, alt;
                    char re='s';
                    System.out.println("Registrar ingeniero");
                    System.out.println("");
                    System.out.println("Ingrese su nombre");
                    nam=sc.next();
                    System.out.println("Ingrese su Sexo");
                    sex=sc.next();
                    System.out.println("Ingrese su grupo sanguineo");
                    grupS=sc.next();
                    System.out.println("Ingrese su altura");
                    alt=sc.nextDouble();
                    System.out.println("Ingrese su peso");
                    peso=sc.nextDouble();
                    System.out.println("Ingrese su correo");
                    corr=sc.next();
                    System.out.println("Ingrese su nombre de usuario");
                    usu=sc.next();
                    while (re=='s'||re=='S'){
                    System.out.println("Ingrese su idioma");
                    idio.add(sc.next());
                        System.out.println("Desea agregar otro idioma? s/n");
                        re=sc.next().charAt(0);
                        
                    }
                    System.out.println("Ingrese su contraseña");
                    conta=sc.next();
                    System.out.println("Ingrese su fecha de nacimento");
                    nac=sc.next();
                    inges.add(new Ingeniero(corr,usu,conta,nac,nam,grupS,sex,alt,peso));
                    break;
                
                default:
                    break;
                
            }
        }
        
    }
    
}
