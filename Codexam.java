/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codexam;

/**
 *
 * @author sverdecadilla
 */
public class Codexam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //muestro por pantalla un texto simple para empezar
        System.out.println("Este es el examen de COD para la segunda evaluacion");
        //llamo a pruebas y lo guardo en un objeto de nombre valores
        pruebas valores = new pruebas();
        //muestro por pantalla los dos datos almacenados en valores
        System.out.println("El dato 1 es: "+valores.Dato1);
        System.out.println("El dato 2 es: "+valores.Dato2);
        //realizo la suma de estos
        System.out.println("La suma de los valores es: " +valores.Dato1+valores.Dato2);
    }
    
}
