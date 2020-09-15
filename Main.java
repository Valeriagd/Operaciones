package com.tecmilenio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int x, y, suma, resta, multiplicacion, division, modulo;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        x = leer.nextInt();

        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        y = lee.nextInt();

        suma = (x+y);
        resta = (x-y);
        multiplicacion = (x*y);
        division = (x/y);
        modulo = (x%y);

        System.out.println("x="+x+ " y="+y);
        System.out.println("suma="+suma);
        System.out.println("resta"+resta);
        System.out.println("multiplicacion="+multiplicacion);
        System.out.println("division="+division);
        System.out.println("modulo="+modulo);
    }
}
