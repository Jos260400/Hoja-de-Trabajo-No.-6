package com.company;
// Universidad del Valle de Guatemala
// Curso: Algoritmos y Estructuras de Datos
// Nombre: Fernando José Garavito Ovando	 Carné: 18071
// Hoja de Trabajo No. 6
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        //Indica si salimos o no
        boolean salir = false;
        int opcion;

        //Bucle para pedir las opciones hasta que elijamos salir
        while (!salir) {

            //opciones
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHaspMap");
            System.out.println("4. Salir");

            try{

                //Pide una opción
                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1:
                        System.out.println("HashMap");
                        break;
                    case 2:
                        System.out.println("TreeMap");
                        break;
                    case 3:
                        System.out.println("LinkedHaspMap");
                        break;
                    case 4:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 4");
                }


                //controla la excepcionn en caso de que se introduzca un valor no correcto
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un numero");
                sn.next();
            }

        }

        System.out.println("Fin del menu");

    }

}