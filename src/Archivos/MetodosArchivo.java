/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivos;

import java.io.*;

/**
 *
 * @author invitado
 */
public class MetodosArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Uso de los metodos basicos de la clase file
        File file = new File("C:\\Users\\INVITADO\\Desktop\\Integrantes");
        //Validar si el archivo existe
        System.out.println(file.exists());
        //Obtener un directorio
        System.out.println(file.isDirectory());
        //Ultima modificacion
        System.out.println(file.lastModified());
        //Obtener el nombre  
        System.out.println(file.getName());
        //Obtener la ruta
        System.out.println(file.getPath());
        //Tamaño del archivo
        System.out.println(file.length());
        //Para saber si es de lectura , devuelve true o false
        System.out.println(file.canRead());
        //Para saber si es de escritura 
        System.out.println(file.canRead());
        //Para saber el tamaño en bytes que ocupa en disco
        System.out.println(file.length());
        //Se crea un directorio en disco, devuelve true o false, para esto la ruta no debe ser .txt
        //Ejemplo: "C:\\archivos\\integrantes" y se crea el directorio Integrantes
        System.out.println(file.mkdir());
        
        //Elimina el archivo o directorio(debe estar vacio)
        //System.out.println(file.delete();
        //Si fuera un directorio, para saber los archivos que contiene
        for(String string:file.list()){
            System.out.println(string);
        }
        
    }
}
