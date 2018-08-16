package com;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int n1, n2;
        double suma, resta, mult, div;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el Primer Valor");
        n1 = in.nextInt();
        System.out.println("Introduce el Segundo Valor");
        n2 = in.nextInt();
        Operaciones p= new Operaciones();
        suma = p.Suma(n1, n2);
        System.out.println("El Resultado de la Suma es: " + suma);
        resta=p.Resta(n1, n2);
        System.out.println("El resultado de la Resta: "+ resta);
        System.out.println("El resultado de la Multiplicación es: "+ p.Multiplicacion(n1, n2));
        System.out.println("El ressultado de la división es: "+p.Division(n1, n2));
    }
}
