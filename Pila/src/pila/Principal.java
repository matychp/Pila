/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author matychp
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila unaPila = new Pila();

        unaPila.push(1);
        unaPila.push(2);
        unaPila.push(3);

        System.out.println("\nMostrando el contenido total de la pila...\n" + unaPila.toString());

        System.out.println("\nRemoviendo el primer elemento de la pila..." + "\nEl objeto contenido es: " + unaPila.pop().toString());

        System.out.println("La pila esta vacia?: " + unaPila.empty());

        unaPila.pop();
        unaPila.pop();
        System.out.println("La pila esta vacia?: " + unaPila.empty());
    }

}
