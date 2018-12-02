/*
 * He utilizado un unico vector de tipo Coche (la clase padre) para guardar todos los coches
 * El programa no incluye nada que no haya sido propuesto en el enunciado y no se han añadido nada nuevo
 *
 */
package AlquileresJaime;

import java.io.IOException;

/**
 *
 * @author jaime-kata
 */
public class GestionAgencia {

    public static void main(String[] args) throws IOException {
        Coche[] flota;
        flota = new Coche[30];
        inicioPrograma(flota);

        int opcion;
        do {
            menu();

            opcion = Leer.pedirEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1://registrar empleado
                    int nCoches = 0;
                    nCoches = Leer.pedirEntero("¿Cuantos coches quieres regsitrar? ");
                    do {
                        int opcionRegistro = 0;
                        Leer.mostrarEnPantalla("Tipo de coche:");
                        opcionRegistro = Leer.pedirEntero("1. Normal, 2. Lujo");
                        switch (opcionRegistro) {
                            case 1:
                                registrarCocheNormal(flota);
                                nCoches --;
                                break;
                            case 2:
                                registrarCocheLujo(flota);
                                nCoches --;
                                break;
                        }

                    } while (nCoches != 0);
                    break;
                case 2:
                    int opcionAlquilar = 0;
                    Leer.mostrarEnPantalla("Tipo");
                    opcionAlquilar = Leer.pedirEntero("1. Normal, 2. Lujo");
                    switch (opcionAlquilar) {
                        case 1:
                            alquilarNormal(flota);
                            break;
                        case 2:
                            alquilarLujo(flota);
                            break;
                    }
                    break;
                case 3:
                    devolverCoche(flota);
                    break;
                case 4:
                    visualizarCochesDisponibles(flota);
                    break;
                case 5:
                    visualizarCochesOcupados(flota);
                    break;
            }
        } while (opcion != 0);
    }//main

    public static void menu() {
        Leer.mostrarEnPantalla("BIENVENIDO A ALQUILERES JAIME S.A");
        Leer.mostrarEnPantalla(" 1.- Registrar coche");
        Leer.mostrarEnPantalla(" 2.- Alquilar coche");
        Leer.mostrarEnPantalla(" 3.- Devolver coche");
        Leer.mostrarEnPantalla(" 4.- Visualizar coches disponibles");
        Leer.mostrarEnPantalla(" 5.- Visualizar coches ocupados");
        Leer.mostrarEnPantalla(" 0.- Fin");
    }//menu 

    public static void inicioPrograma(Coche flota[]) {
        Fecha fechaFabricacion = new Fecha(12,05,2017);
        CocheNormal coche1 = new CocheNormal("11111a", "Audi", "A3", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche2 = new CocheNormal("22222a", "Volswagen", "Golf", fechaFabricacion,20,"IberPark");
        CocheNormal coche3 = new CocheNormal("33333a", "Volswagen", "Polo", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche4 = new CocheNormal("44444a", "Volswagen", "Passat", fechaFabricacion,20,"IberPark");
        CocheNormal coche5 = new CocheNormal("55555a", "Audi", "A5", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche6 = new CocheNormal("66666a", "Audi", "A6", fechaFabricacion,20,"IberPark");
        CocheNormal coche7 = new CocheNormal("77777a", "BMW", "M2", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche8 = new CocheNormal("88888a", "BMW", "M3", fechaFabricacion,20,"IberPark");
        CocheNormal coche9 = new CocheNormal("99999a", "BMW", "M4", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche10 = new CocheNormal("11111b", "BMW", "S3", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche11 = new CocheNormal("12222b", "BMW", "S4", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche12 = new CocheNormal("13333b", "Mercedes", "GLK", fechaFabricacion,20,"IberPark");
        CocheNormal coche13 = new CocheNormal("14444b", "Mercedes", "GLK", fechaFabricacion,20,"IberPark");
        CocheNormal coche14 = new CocheNormal("15555b", "Mercedes", "GLK", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheNormal coche15 = new CocheNormal("16666b", "Mercedes", "GLK", fechaFabricacion,20,"Aparcamiento del Ebro");
        CocheLujo lujo1 = new CocheLujo("11111c", "Audi", "A7", fechaFabricacion,60);
        CocheLujo lujo2 = new CocheLujo("22222c", "Audi", "RS7", fechaFabricacion,60);
        CocheLujo lujo3 = new CocheLujo("33333c", "Audi", "RS6", fechaFabricacion,60);
        CocheLujo lujo4 = new CocheLujo("44444c", "Audi", "Q7", fechaFabricacion,60);
        CocheLujo lujo5 = new CocheLujo("55555c", "Audi", "S8", fechaFabricacion,60);
        flota[0]= coche1;
        flota[1]= coche2;
        flota[2]= coche3;
        flota[3]= coche4;
        flota[4]= coche5;
        flota[5]= coche6;
        flota[6]= coche7;
        flota[7]= coche8;
        flota[8]= coche9;
        flota[9]= coche10;
        flota[10]= coche11;
        flota[11]= coche12;
        flota[12]= coche13;
        flota[13]= coche14;
        flota[14]= coche15;
        flota[15]= lujo1;
        flota[16]= lujo2;
        flota[17]= lujo3;
        flota[18]= lujo4;
        flota[19]= lujo5;

    }

    public static void registrarCocheNormal(Coche flota[]) {
        String matricula = null;
        String marca = null;
        String modelo = null;
        Fecha fechaFabricacion = null;
        Integer dia = null;
        Integer mes = null;
        Integer year = null;
        Integer precioDiario = 0;
        boolean error = true;
        String aparcamiento = null;
        CocheNormal nuevoCoche = null;
        Leer.mostrarEnPantalla("REGISTRO DE COCHE NORMAL");
        Leer.mostrarEnPantalla("------------------------");
        matricula = Leer.pedirCadena("Matricula: ");
        marca = Leer.pedirCadena("Marca: ");
        modelo = Leer.pedirCadena("Modelo: ");
        Leer.mostrarEnPantalla("Registro de fecha de fabricacion");
        dia = Leer.pedirEntero("Dia:");
        mes = Leer.pedirEntero("Mes:");
        year = Leer.pedirEntero("Año:");
        fechaFabricacion = new Fecha(dia, mes, year);
        precioDiario = Leer.pedirEntero("Precio diario");
        Leer.mostrarEnPantalla("Indique aparcamiento");
        Leer.mostrarEnPantalla("1. Aparcamiento del Ebro, 2. IberPark, 3. Aragonia");
        while (error) {
            aparcamiento = Leer.pedirCadena("Digame el aparcamiento: ");
            if (aparcamiento.equalsIgnoreCase("Aparcamiento del Ebro") == true || aparcamiento.equalsIgnoreCase("IberPark") == true || aparcamiento.equalsIgnoreCase("Aragonia") == true) {
                error = false;
            } else {
                error = true;
                Leer.mostrarEnPantalla("Indique aparcamiento");
                Leer.mostrarEnPantalla("1. Aparcamiento del Ebro, 2. IberPark, 3. Aragonia");
            }
        }
        nuevoCoche = new CocheNormal(matricula, marca, modelo, fechaFabricacion, precioDiario, aparcamiento);
        altaCoche(nuevoCoche, flota);
    }

    public static void altaCoche(Coche nuevoCoche, Coche flota[]) {
        for (int i = 0; i < flota.length; i++) {
            if (flota[i] == null) {
                flota[i] = nuevoCoche;
                System.out.println("-Coche registrado con exito-");
                Leer.mostrarEnPantalla("");
                break;//hago break para que no guarde el mismo coche en todas las posiciones vacias 
            }
        }
    }

    public static void registrarCocheLujo(Coche flota[]) {
        String matricula = null;
        String marca = null;
        String modelo = null;
        Fecha fechaFabricacion = null;
        Integer dia = null;
        Integer mes = null;
        Integer year = null;
        Integer precioDiario = 0;

        CocheLujo nuevoCoche = null;
        Leer.mostrarEnPantalla("REGISTRO DE COCHE DE LUJO");
        Leer.mostrarEnPantalla("-------------------------");
        matricula = Leer.pedirCadena("Matricula: ");
        marca = Leer.pedirCadena("Marca: ");
        modelo = Leer.pedirCadena("Modelo: ");
        Leer.mostrarEnPantalla("Registro de fecha de fabricacion");
        dia = Leer.pedirEntero("Dia:");
        mes = Leer.pedirEntero("Mes:");
        year = Leer.pedirEntero("Año:");
        fechaFabricacion = new Fecha(dia, mes, year);
        precioDiario = Leer.pedirEntero("Precio diario");
        nuevoCoche = new CocheLujo(matricula, marca, modelo, fechaFabricacion, precioDiario);
        altaCoche(nuevoCoche, flota);
    }

    public static void alquilarNormal(Coche flota[]) {
        String matricula = null;
        for (int i = 0; i < flota.length && flota[i] != null; i++) {
            if (flota[i] instanceof CocheNormal && flota[i].isDisponible() == true) {
                Leer.mostrarEnPantalla(flota[i].toString());
            }
        }
        matricula = Leer.pedirCadena("Introduzca la matricula del vehiculo deseado: ");
        for (int i = 0; i < flota.length && flota[i] != null; i++) {
            if (flota[i].getMatricula().equalsIgnoreCase(matricula) == true) {
                flota[i].setDisponible(false);
                System.out.println("La matricula de su vehiculo es: " + matricula);
                break;
            }
        }
    }

    public static void alquilarLujo(Coche flota[]) {
        String matricula = null;
        for (int i = 0; i < flota.length && flota[i] != null; i++) {
            if (flota[i] instanceof CocheLujo && flota[i].isDisponible() == true) {
                Leer.mostrarEnPantalla(flota[i].toString());
            }
        }
        matricula = Leer.pedirCadena("Introduzca la matricula del vehiculo deseado: ");
        for (int i = 0; i < flota.length && flota[i] != null; i++) {
            if (flota[i].getMatricula().equalsIgnoreCase(matricula) == true) {
                flota[i].setDisponible(false);
                System.out.println("La matricula de su vehiculo es: " + matricula);
                break;
            }
        }
    }

    public static void devolverCoche(Coche flota[]) {
        String matricula = null;
        Integer diasAlquilado = 0;
        Integer precio =0;
        matricula = Leer.pedirCadena("Introduzca la matricula del vehiculo: ");
        for (int i = 0; i < flota.length && flota[i] != null; i++) {
            if (flota[i].getMatricula().equalsIgnoreCase(matricula) == true) {
                flota[i].setDisponible(true);
                diasAlquilado = Leer.pedirEntero("Dias alquilado: ");
                precio = flota[i].devolver(diasAlquilado);
                Leer.mostrarEnPantalla("El importe es: "+precio);
            }
        }
    }

    public static void visualizarCochesDisponibles(Coche flota[]) {
        for(int i = 0; i < flota.length && flota[i] != null; i++) {
            if (flota[i].isDisponible() == true) {
                Leer.mostrarEnPantalla(flota[i].toString());
            }
        }
        Leer.mostrarEnPantalla("");
    }

    public static void visualizarCochesOcupados(Coche flota[]) {
        for (int i = 0; i < flota.length && flota[i] != null; i++) {
            if (flota[i].isDisponible() == false) {
                Leer.mostrarEnPantalla(flota[i].toString());
            }
        }
        Leer.mostrarEnPantalla("");
    }
}
