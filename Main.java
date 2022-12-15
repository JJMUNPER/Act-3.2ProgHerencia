package org.Ejercicios.ejercicio3tema3Herencia;

public class Main extends Perro {



    public static void main(String[] args) {

        Perro perro1 = new Perro();
        perro1.nombre ="Toby";
        perro1.raza="Podenco";
        System.out.println("¡Guau! me llamo " + perro1.nombre + " y soy un " + perro1.raza);
        perro1.imprime();
        perro1.imprimePorPartes();

        Perro perro2 = new Perro(perro1.raza);
        perro2.imprimePorPartes();

        Perro perro3 = new Perro(perro1.raza, perro1.nombre);



    }
}
