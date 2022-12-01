/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exepcion1;

/**
 *
 * @author MandoParra
 */
public class Divisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x=15;
        double y=0; //Se divide entre 0
        //Se desarrolla la excepcion
        try{
        System.out.println("El resultado de la division de "+x+" entre "+y+" es: "+division(x,y));
        //Se crea mi excepcion para guardar el error
        }catch(Exception mi_excepcion){
            System.err.println("Ha intentado dividir entre cero");
            System.err.println("El objeto excepcion lanzado es : "+mi_excepcion.toString());
        }
    }
public static double division(double dividendo, double divisor){
    
    return (dividendo/divisor);
}
    
}
