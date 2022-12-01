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
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            mostrarArray();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ha intentado acceder a una posicion fuera del arreglo");
        }
    }
    //Se crea metodo
    public static void mostrarArray(){
        //Se especifican valores del arreglo
        //Todo arreglo empieza en 1,2,3
        int[]array ={1,2,3};
        //Se valida tamaño del arreglo
        //j<=3 indica el tamaño del arreglo
        for(int j=0;j<=3;j++)
            System.out.println(array[j]);
    }
}
