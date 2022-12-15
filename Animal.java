package org.Ejercicios.ejercicio3tema3Herencia;

public class Animal {

    String nombre;

    Animal (){

    }

    Animal (String nombre){
        this.nombre = nombre;
    }

    void imprime () {
        System.out.println("¡Guau! me llamo " + nombre);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
