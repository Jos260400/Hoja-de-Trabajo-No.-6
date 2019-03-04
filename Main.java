package com.company;
// Universidad del Valle de Guatemala
// Curso: Algoritmos y Estructuras de Datos
// Nombre: Fernando José Garavito Ovando	 Carné: 18071
// Hoja de Trabajo No. 6
import Classes.Factory;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.nio.file.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        boolean cero = true;
        boolean uno = false;
        boolean dos = false;
        String carta = "";

        //Definimos si salimos o no y nuestra variable opcion
        boolean salir = false;
        int opcion;


        ArrayList<String> todo = new ArrayList<>();
        ArrayList<String> dato = new ArrayList<>();
        ArrayList<String> todos = new ArrayList<>();
        ArrayList<String> datos = new ArrayList<>();
        //-------------------------------------------
        Map<String, String> Carta = null;
        Map<String, String> cartasdeel= null;
        Factory<String, String> factorymmmmm = new Factory<>();


        //Usamos este bucle para pedir las opciones hasta que elijamos salir
        while (!salir) {

            //Menu
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHaspMap");
            System.out.println("4. Salir");

            try{

                //Indicamos la opción que queremos
                System.out.println("Introduce un número: ");
                opcion = sn.nextInt();

                //Mostramos cada una de las opciones
                switch (opcion) {
                    case 1:
                        System.out.println("\nHashMap");

                        System.out.println("Agregar una carta");
                        System.out.println("Tipo y nombre de la carta ");
                        System.out.println("Tipo y cantidad de la carta de tu baraja");
                        System.out.println("Tipo y cantidad de la carta del adversario");
                        System.out.println("Tipo y nombre de las cartas existentes");
                        System.out.println("Tipo y nombre de las cartas existentes en orden");
                        break;
                    case 2:
                        System.out.println("\nTreeMap");

                        System.out.println("Agregar una carta");
                        System.out.println("Tipo y nombre de la carta ");
                        System.out.println("Tipo y cantidad de la carta de tu baraja");
                        System.out.println("Tipo y cantidad de la carta del adversario");
                        System.out.println("Tipo y nombre de las cartas existentes");
                        System.out.println("Tipo y nombre de las cartas existentes en orden");
                        break;
                    case 3:
                        System.out.println("\nLinkedHaspMap");

                        System.out.println("Agregar una carta");
                        System.out.println("Tipo y nombre de la carta ");
                        System.out.println("Tipo y cantidad de la carta de tu baraja");
                        System.out.println("Tipo y cantidad de la carta del adversario");
                        System.out.println("Tipo y nombre de las cartas existentes");
                        System.out.println("Tipo y nombre de las cartas existentes en orden");
                        break;
                    case 4:
                        salir=true;
                        break;
                    default:
                        System.out.println("\nLas opciones son entre 1 y 4");
                }

                //Usamos esto para que el usuario note que solo se pueden ingresar valores númericos
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un número");
                sn.next();
            }

        }

        System.out.println("Fin del menu");

    }

}