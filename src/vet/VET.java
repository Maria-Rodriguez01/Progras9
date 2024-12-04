/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

import java.util.Scanner;

/**
 *
 * @author Maria Gabriela
 */
public class VET {

    static int bancantidad = 0;
    static int concantidad = 0;
    static int ocantidad = 0;
    static int scantidad = 0;
    static int mcantidad = 0;
    static int bcantidad = 0;
    static int bpequeno = 0;
    static int bmediano = 0;
    static int bgrande = 0;
    static int cpequeno = 0;
    static int cmediano = 0;
    static int cgrande = 0;
    static int opequeno = 0;
    static int omediano = 0;
    static int ogrande = 0;
    static double total=0;
    static int perro=0,gato=0,conejo=0,exotico=0;

    public static void mostrar() {
        System.out.println("===== 🐾Resumen del día🐾 =====");
        System.out.println(" ");
        System.out.println("***Bañados***");
        System.out.println("Bañados realizados: " + bancantidad);
        System.out.println("Bañados a animal pequeño(s)" + bpequeno);
        System.out.println("Bañados a animal mediano(s)" + bmediano);
        System.out.println("Bañados a animal grande(s)" + bgrande);
        System.out.println("");
        System.out.println("***Consultas***");
        System.out.println("Consultas médicas realizadas: " + concantidad);
        System.out.println("Consultas a animales pequeño(s)" + cpequeno);
        System.out.println("Conultas a animales mediano(s)" + cmediano);
        System.out.println("Consultas a animales grande(s)" + cgrande);
        System.out.println("");
        System.out.println("***Otros Servicios***");
        System.out.println("Otros servicios realizados: " + ocantidad);
        System.out.println("Otros servicios a animales pequeño(s)" + opequeno);
        System.out.println("Otros servicios a animales mediano(s)" + omediano);
        System.out.println("Otros servicios a animales grande(s)" + ogrande);
        System.out.println("");
        System.out.println("******Tamaños******");
        System.out.println("Total de Animales pequeños atendidos: " + scantidad);
        System.out.println("Total de Animales medianos atendidos: " + mcantidad);
        System.out.println("Total de Animales grandes atendidos: " + bcantidad);
        System.out.println("");
        System.out.println("***Tipo de animal***");
        System.out.println("Perros:"+perro);
        System.out.println("Gatos:"+gato);
        System.out.println("Conejos:"+conejo);
        System.out.println("Animales exoticos:"+exotico);
        System.out.println("");
        System.out.println("***Dinero final de ventas***");
        System.out.print("Lps."+total);
    }

    public static servicio datos = new servicio();

    public static void main(String[] args) {
        
        double precio[] = new double[9];
        precio[0] = 150;
        precio[1] = 300;
        precio[2] = 500;
        precio[3] = 200;
        precio[4] = 400;
        precio[5] = 600;
        precio[6] = 100;
        precio[7] = 200;
        precio[8] = 300;

        Scanner entrada = new Scanner(System.in);
        int servicio,opcion, especie;

        System.out.println("==== 🐾🎀 Bienvenido a la Veterinaria M&C 🎀🐾 ====");
        while (true) {
            System.out.println("Que desea realizar?\n"
                    + "1.Inicializar Servicio\n"
                    + "2.Cerrar Caja");
            System.out.println("Ingrese una opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("==== Has elegido inicializar servicio 🐶 ====");
                    System.out.println("");
                    System.out.println("Que servicio desea realizar?\n"
                            + "1.Bañado\n"
                            + "2.Consulta medica\n"
                            + "3.Otro");
                    servicio = entrada.nextInt();
                    switch (servicio) {
                        case 1:
                            bancantidad++;
                            System.out.println("=== Servicio de bañado ha sido selecionado ===");
                            System.out.println("Que especie es su mascota?\n"
                                    + "1.Perro\n"
                                    + "2.Gato\n"
                                    + "3.Conejo\n"
                                    + "4.Animal exotico");
                            especie = entrada.nextInt();
                            switch(especie){
                                case 1:
                                    perro++;
                                    break;
                                case 2:
                                    gato++;
                                    break;
                                case 3:
                                    conejo++;
                                    break;
                                case 4:
                                    exotico++;
                                    break;
                            }
                            System.out.println("¿Cuál es el tamaño de su mascota? (pequeño, mediano, grande)");
                            int tamano = entrada.nextInt();
                            switch (tamano) {
                                case 1:
                                    bpequeno++;
                                    total += precio[6];
                                    break;
                                case 2:
                                    bmediano++;
                                    total += precio[7];
                                    break;
                                case 3:
                                    bgrande++;
                                    total += precio[8];
                                    break;

                            }
                            break;
                        case 2:
                            concantidad++;
                            System.out.println("=== Servicio de Consulta médica ha sido selecionado ===");
                            System.out.println("Que especie es su mascota?\n"
                                    + "1.Perro\n"
                                    + "2.Gato\n"
                                    + "3.Conejo\n"
                                    + "4.Animal exotico");
                            especie = entrada.nextInt();
                            switch(especie){
                                case 1:
                                    perro++;
                                    break;
                                case 2:
                                    gato++;
                                    break;
                                case 3:
                                    conejo++;
                                    break;
                                case 4:
                                    exotico++;
                                    break;
                            }
                            System.out.println("¿Cuál es el tamaño de su mascota? (pequeño, mediano, grande)");
                            tamano = entrada.nextInt();
                            switch (tamano) {
                                case 1:
                                    cpequeno++;
                                    total += precio[6];
                                    break;
                                case 2:
                                    cmediano++;
                                    total += precio[7];
                                    break;
                                case 3:
                                    cgrande++;
                                    total += precio[8];
                                    break;

                            }

                            break;
                        case 3:
                            ocantidad++;
                            System.out.println("=== Otro servicio ha sido seleccionado. Ingrese que desea realizar. ===");
                            String otro = entrada.next();
                            System.out.println("Que especie es su mascota?\n"
                                    + "1.Perro\n"
                                    + "2.Gato\n"
                                    + "3.Conejo\n"
                                    + "4.Animal exotico");
                            especie = entrada.nextInt();
                            switch(especie){
                                case 1:
                                    perro++;
                                    break;
                                case 2:
                                    gato++;
                                    break;
                                case 3:
                                    conejo++;
                                    break;
                                case 4:
                                    exotico++;
                                    break;
                            }
                            System.out.println("¿Cuál es el tamaño de su mascota? (1.pequeño, 2.mediano, 3.grande)");
                            tamano = entrada.nextInt();
                            switch (tamano) {
                                case 1:
                                    opequeno++;
                                    total += precio[6];
                                    break;
                                case 2:
                                    omediano++;
                                    total += precio[7];
                                    break;
                                case 3:
                                    ogrande++;
                                    total += precio[8];
                                    break;

                            }
                            break;
                    }
                    break;

                case 2:
                    mostrar();
                    break;

                default:
                    System.out.println("Opción no valida. Porfavor intente otra vez. ✖");

            }
            
        }
        
    }

}
