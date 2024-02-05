package org.example;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String jugador1;
        String jugador2;
        String eleccionUsuario1;
        String eleccionUsuario2;

        Scanner leer=new Scanner(System.in);

        System.out.println("*****Bienvenido******");
        System.out.println("El jugador 1 ingresa su eleccion: ");
        eleccionUsuario1 = leer.nextLine();
        System.out.println("El jugador 2 ingresa su eleccion: ");
        eleccionUsuario2 = leer.nextLine();

        if (eleccionUsuario1.equals(eleccionUsuario2)){
            System.out.println("empate");
        }else if (eleccionUsuario1.equals("piedra") && eleccionUsuario2.equals("tijera") ||
                  eleccionUsuario1.equals("tijera") && eleccionUsuario2.equals("papel") ||
                  eleccionUsuario1.equals("papel") && eleccionUsuario2.equals("piedra")){
            System.out.println("gano el jugador 1");
        }else{
            System.out.println("gano el jugador 2");
        }

    }
}