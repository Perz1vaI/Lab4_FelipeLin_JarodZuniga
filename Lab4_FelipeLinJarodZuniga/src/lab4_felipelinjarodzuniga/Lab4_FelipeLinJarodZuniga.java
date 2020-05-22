package lab4_felipelinjarodzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_FelipeLinJarodZuniga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SeresVivos> primates = new ArrayList();
        ArrayList<Transporte> helicoptero = new ArrayList();
        ArrayList<Transporte> avion = new ArrayList();
        ArrayList<Transporte> cohete = new ArrayList();
        ArrayList<Transporte> nave = new ArrayList();
        ArrayList<Ingeniero> inges = new ArrayList();
        int cont_heli = 0, cont_avion = 0, cont_cohete = 0, cont_nave = 0;
        int menu = 0;
        while (menu != 3) {
            System.out.println("1. Login\n2. Sign in\n3. Cancelar");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    int v = 0;
                    System.out.println("Ingresar ");
                    System.out.println("");
                    System.out.println("Ingeniero ingrese su usuario");
                    String us = sc.next();
                    System.out.println("Ingeniero ingrese su contraseña");
                    String ps = sc.next();
                    for (int i = 0; i <= inges.size(); i++) {
                        if (us.equals(inges.get(i).getUsuario())) {
                            if (ps.equals(inges.get(i).getContra())) {
                                System.out.println("Bienvenido ingeniero " + us + " ");
                                v = 1;
                                break;
                            } else {
                                System.out.println("Contraseña Incorrecta");
                                v = 0;
                            }
                        } else {
                            System.out.println("Usuario no existente porfavor registrese");
                            v = 0;
                        }
                    }
                    if (v == 1) {
                        System.out.println("1. Crear \n2. Modificar\n3. Eliminar");
                        int menu2 = sc.nextInt();
                        switch (menu2) {
                            case 1: {
                                // Crear
                                System.out.println("1. Crear Primates\n 2. Crear Transportes");
                                int menu_crear = sc.nextInt();
                                switch (menu_crear) {
                                    case 1: {
                                        // Crear Primates
                                        System.out.println("1. Crear Mono\n2. Crear Gorila");
                                        int menu_prim = sc.nextInt();
                                        switch (menu_prim) {
                                            case 1: {
                                                // Mono
                                                System.out.println("Ingrese su nombre: ");
                                                String nombre = sc.next();
                                                System.out.println("Ingrese su grupo sanguineo: ");
                                                String grupoS = sc.next();
                                                System.out.println("Ingrese el sexo: ");
                                                String sexo = sc.next();
                                                System.out.println("Ingrese la altura: ");
                                                int altura = sc.nextInt();
                                                System.out.println("Ingrese el peso: ");
                                                int peso = sc.nextInt();
                                                System.out.println("Ingrese la cantidad de comida: ");
                                                int comida = sc.nextInt();
                                                System.out.println("Ingrese cuanta comida come por kilometro: ");
                                                int km_comida = sc.nextInt();
                                                System.out.println("Ingrese su planeta asignado: ");
                                                String planeta = sc.next();
                                                System.out.println("Ingrese su lugar de nacimiento: ");
                                                String LugarN = sc.next();
                                                System.out.println("Ingrese el color de su pelo: ");
                                                String color = sc.next();

                                                primates.add(new Mono(color, comida, km_comida, planeta, LugarN, nombre, grupoS, sexo, altura, peso));

                                                break;
                                            }
                                            case 2: {
                                                // Gorila
                                                System.out.println("Ingrese su nombre: ");
                                                String nombre = sc.next();
                                                System.out.println("Ingrese su grupo sanguineo: ");
                                                String grupoS = sc.next();
                                                System.out.println("Ingrese el sexo: ");
                                                String sexo = sc.next();
                                                System.out.println("Ingrese la altura: ");
                                                int altura = sc.nextInt();
                                                System.out.println("Ingrese el peso: ");
                                                int peso = sc.nextInt();
                                                System.out.println("Ingrese la cantidad de comida: ");
                                                int comida = sc.nextInt();
                                                System.out.println("Ingrese cuanta comida come por kilometro: ");
                                                int km_comida = sc.nextInt();
                                                System.out.println("Ingrese su planeta asignado: ");
                                                String planeta = sc.next();
                                                System.out.println("Ingrese su lugar de nacimiento: ");
                                                String LugarN = sc.next();
                                                System.out.println("Ingrese el IQ (130-139): ");
                                                int IQ = sc.nextInt();

                                                primates.add(new Gorilla(IQ, comida, km_comida, planeta, LugarN, nombre, grupoS, sexo, altura, peso));
                                                break;
                                            }

                                            default:
                                                System.out.println("No existe esa opcion!");
                                        }

                                        break;
                                    }
                                    case 2: {
                                        // Crear Transportes
                                        System.out.println("1. Crear Aereo normal\n2. Crear Espacial");
                                        int menu_trans = sc.nextInt();

                                        switch (menu_trans) {
                                            case 1: {
                                                // Aereo
                                                System.out.println("1. Crear Helicoptero\n2. Crear Avion");
                                                int menu_aereo = sc.nextInt();
                                                switch (menu_aereo) {
                                                    case 1: {
                                                        // helicoptero
                                                        System.out.println("Ingrese la cantidad de combustible: ");
                                                        int cant_conm = sc.nextInt();
                                                        System.out.println("Ingrese la distancia que puede recorrer con el tanque lleno");
                                                        double dis_tan = sc.nextInt();
                                                        System.out.println("Ingrese la altitud: ");
                                                        double altitud = sc.nextInt();
                                                        System.out.println("Ingrese cuantos primates va tener: ");
                                                        int cant_prim = sc.nextInt();
                                                        for (SeresVivos p : primates) {
                                                            System.out.println("Posicion " + primates.indexOf(p) + " " + p);
                                                        }
                                                        for (int i = 0; i < cant_prim; i++) {
                                                            System.out.println("Ingrese la posicion del primate que quiere agregar");
                                                            int pos = sc.nextInt();

                                                            helicoptero.get(cont_heli).setPrimates(((SeresVivos) primates.get(pos)));
                                                            primates.remove(pos);
                                                        }
                                                        System.out.println("Ingrese que tipo de Gasolina tiene: 1. Super 2. Regular 3. diesel");
                                                        String tipogas = sc.next();
                                                        System.out.println("Ingrese el pais de partida: ");
                                                        String partida = sc.next();
                                                        System.out.println("Ingrese el pais de llegada: ");
                                                        String destino = sc.next();
                                                        System.out.println("Ingrese el numero de helices: ");
                                                        int helices = sc.nextInt();
                                                        System.out.println("Ingrese el numero de patas");
                                                        int patas = sc.nextInt();

                                                        helicoptero.add(new Helicoptero(helices, patas, tipogas, destino, partida, cant_conm, dis_tan, altitud));
                                                        cont_heli++;

                                                        break;
                                                    }
                                                    case 2: {
                                                        // avion comercial
                                                        System.out.println("Ingrese la cantidad de combustible: ");
                                                        int cant_conm = sc.nextInt();
                                                        System.out.println("Ingrese la distancia que puede recorrer con el tanque lleno");
                                                        double dis_tan = sc.nextInt();
                                                        System.out.println("Ingrese la altitud: ");
                                                        double altitud = sc.nextInt();
                                                        System.out.println("Ingrese cuantos primates va tener: ");
                                                        int cant_prim = sc.nextInt();
                                                        for (SeresVivos p : primates) {
                                                            System.out.println("Posicion " + primates.indexOf(p) + " " + p);
                                                        }
                                                        for (int i = 0; i < cant_prim; i++) {
                                                            System.out.println("Ingrese la posicion del primate que quiere agregar");
                                                            int pos = sc.nextInt();

                                                            avion.get(cont_avion).setPrimates(((SeresVivos) primates.get(pos)));
                                                            primates.remove(pos);

                                                        }
                                                        System.out.println("Ingrese que tipo de Gasolina tiene: 1. Super 2. Regular 3. diesel");
                                                        String tipogas = sc.next();
                                                        System.out.println("Ingrese el pais de partida: ");
                                                        String partida = sc.next();
                                                        System.out.println("Ingrese el pais de llegada: ");
                                                        String destino = sc.next();
                                                        System.out.println("Ingrese el numero de pasajeros: ");
                                                        int num_pas = sc.nextInt();
                                                        System.out.println("Funciona el piloto automatica 1. si 2. no");
                                                        String piloto_auto = sc.next();
                                                        boolean auto = false;

                                                        if (piloto_auto.equals("1")) {
                                                            auto = true;
                                                        } else if (piloto_auto.equals("2")) {
                                                            auto = false;
                                                        }

                                                        avion.add(new Comercial(num_pas, auto, tipogas, destino, partida, cant_conm, dis_tan, altitud));
                                                        cont_avion++;
                                                        break;
                                                    }
                                                    default:
                                                        System.out.println("No existe esa opcion!");
                                                }
                                                break;
                                            }
                                            case 2: {
                                                // Espacial
                                                System.out.println("1. Crear Nave Espacial\n2. Crear Cohete");
                                                int menu_espacial = sc.nextInt();

                                                switch (menu_espacial) {
                                                    case 1: {
                                                        // Nave 
                                                        System.out.println("Ingrese la cantidad de combustible: ");
                                                        int cant_conm = sc.nextInt();
                                                        System.out.println("Ingrese la distancia que puede recorrer con el tanque lleno");
                                                        double dis_tan = sc.nextInt();
                                                        System.out.println("Ingrese la altitud: ");
                                                        double altitud = sc.nextInt();
                                                        System.out.println("Ingrese cuantos primates va tener: ");
                                                        int cant_prim = sc.nextInt();
                                                        for (SeresVivos p : primates) {
                                                            System.out.println("Posicion " + primates.indexOf(p) + " " + p);
                                                        }
                                                        for (int i = 0; i < cant_prim; i++) {
                                                            System.out.println("Ingrese la posicion del primate que quiere agregar");
                                                            int pos = sc.nextInt();

                                                            nave.get(cont_nave).setPrimates(((SeresVivos) primates.get(pos)));
                                                            primates.remove(pos);

                                                        }
                                                        System.out.println("Ingrese que tipo de combustible tiene: 1. Quimico Solido 2. Propelente Liquido");
                                                        String tipogas = sc.next();
                                                        System.out.println("Ingrese el planeta de partida: ");
                                                        String partida = sc.next();
                                                        System.out.println("Ingrese el planeta de llegada: ");
                                                        String destino = sc.next();
                                                        System.out.println("Ingrese el numero de propulsores: ");
                                                        int propul = sc.nextInt();

                                                        nave.add(new Nave_Espacial(propul, tipogas, partida, destino, cant_conm, dis_tan, altitud));
                                                        cont_nave++;
                                                        break;
                                                    }
                                                    case 2: {
                                                        //Cohete
                                                        System.out.println("Ingrese la cantidad de combustible: ");
                                                        int cant_conm = sc.nextInt();
                                                        System.out.println("Ingrese la distancia que puede recorrer con el tanque lleno");
                                                        double dis_tan = sc.nextInt();
                                                        System.out.println("Ingrese la altitud: ");
                                                        double altitud = sc.nextInt();
                                                        System.out.println("Ingrese cuantos primates va tener: ");
                                                        int cant_prim = sc.nextInt();
                                                        for (SeresVivos p : primates) {
                                                            System.out.println("Posicion " + primates.indexOf(p) + " " + p);
                                                        }
                                                        for (int i = 0; i < cant_prim; i++) {
                                                            System.out.println("Ingrese la posicion del primate que quiere agregar");
                                                            int pos = sc.nextInt();

                                                            cohete.get(cont_cohete).setPrimates(((SeresVivos) primates.get(pos)));
                                                            primates.remove(pos);

                                                        }
                                                        System.out.println("Ingrese que tipo de combustible tiene: 1. Quimico Solido 2. Propelente Liquido");
                                                        String tipogas = sc.next();
                                                        System.out.println("Ingrese el planeta de partida: ");
                                                        String partida = sc.next();
                                                        System.out.println("Ingrese el planeta de llegada: ");
                                                        String destino = sc.next();
                                                        System.out.println("Ingrese el numero de separaciones: ");
                                                        int separaciones = sc.nextInt();

                                                        cohete.add(new Cohete(separaciones, tipogas, partida, destino, cant_conm, dis_tan, altitud));
                                                        cont_cohete++;

                                                        break;
                                                    }
                                                    default:
                                                        System.out.println("No existe esa opcion!");
                                                }

                                                break;
                                            }
                                            default:
                                                System.out.println("No existe esa opcion!");
                                        }

                                        break;
                                    }
                                    default:
                                        System.out.println("No existe esa opcion");
                                }
                                break;
                            }
                            case 2: {
                                // Eliminar
                                break;
                            }
                            case 3: {
                                // Modificar
                                break;
                            }
                            default:
                                System.out.println("No existe esa opcion!");
                        }
                    }

                    break;

                case 2:
                    String nam;
                    String sex;
                    String corr;
                    String usu;
                    String conta;
                    String nac;
                    String grupS;
                    ArrayList idio = new ArrayList();
                    double peso,
                     alt;
                    char re = 's';
                    System.out.println("Registrar ingeniero");
                    System.out.println("");
                    System.out.println("Ingrese su nombre");
                    nam = sc.next();
                    System.out.println("Ingrese su Sexo");
                    sex = sc.next();
                    System.out.println("Ingrese su grupo sanguineo");
                    grupS = sc.next();
                    System.out.println("Ingrese su altura");
                    alt = sc.nextDouble();
                    System.out.println("Ingrese su peso");
                    peso = sc.nextDouble();
                    System.out.println("Ingrese su correo");
                    corr = sc.next();
                    System.out.println("Ingrese su nombre de usuario");
                    usu = sc.next();
                    while (re == 's' || re == 'S') {
                        System.out.println("Ingrese su idioma");
                        idio.add(sc.next());
                        System.out.println("Desea agregar otro idioma? s/n");
                        re = sc.next().charAt(0);

                    }
                    System.out.println("Ingrese su contraseña");
                    conta = sc.next();
                    System.out.println("Ingrese su fecha de nacimento");
                    nac = sc.next();
                    inges.add(new Ingeniero(corr, usu, conta, nac, nam, grupS, sex, alt, peso));
                    break;

                default:
                    break;

            }
        }

    }

}
