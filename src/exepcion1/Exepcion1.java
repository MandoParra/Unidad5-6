/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exepcion1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MandoParra
 */
public class Exepcion1 {

    /**
     * @param args the command line arguments
     * En un bloque try obtenga la lectura del total de numeros
     */
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int x=0, y=0, z=0, k=0;
        boolean repetir;
        do{
            repetir=false;
            try{
                System.out.println("Introduza el primer valor: ");
                x=nums.nextInt();
                System.out.println("Introduza el segundo valor: ");
                y=nums.nextInt();
                System.out.println("Introduza el tercer valor: ");
                z=nums.nextInt();
                System.out.println("Introduza el cuarto valor: ");
                k=nums.nextInt();
                //Se crea o se asigna e para atrapar el error
            }catch(java.util.InputMismatchException e){
                //Se concatena el metodo toString a la variable asisgnada en catch "e" para obtener el valor de esta
                System.err.println("Valor NO valido"+e.toString());
                nums.nextLine();
                repetir=true;
            }
        }while(repetir);
        System.out.println("Valor introducido: "+x);
        System.out.println("Valor introducido: "+y);
        System.out.println("Valor introducido: "+z);
        System.out.println("Valor introducido: "+k);
        
    }
    
}
