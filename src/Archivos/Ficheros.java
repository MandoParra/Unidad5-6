/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Archivos;

import java.io.*;
import java.util.*;
// El * es para importar todas las clases de una libreria

/**
 *
 * @author MandoParra
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // Hacer uso del bloque try / catch
        try{
            File file = new File ("entrada_salida2.txt");
            //Lanza NullPointerException, si la cadena esta vacia 
            // Crear el archivo solo si no existe
            boolean success = file.createNewFile();
            //Lanza IOException o securityExeception
            if(success){
                //El archivo no existe, se crea
                System.out.println("El archivo no existe y se crea");
                //Comprobar si el archivo permite lectura/escritura
                System.out.println("El archivo permite ESCRIBIR:"+file.canWrite());
                System.out.println("El archivo permite LECTURA:"+file.canRead());
                //Se le asosia al archivo un Buffer de escritura
                BufferedWriter file_escribir = new BufferedWriter(new FileWriter(file));
                //Lanza IOException 
                file_escribir.newLine();
                file_escribir.write("8.5");
                //Lanza NEWException
                file_escribir.newLine();
                file_escribir.write("6");
                //Lanza IOException
                file_escribir.newLine();
                // flush se utiliza para vaciar
                file_escribir.flush();//Lanza IOException
                file_escribir.close();
                
                //Ahora se abre el fichero para la lectura
                //Para esto se utiliza la clase Scanner
                Scanner file_lectura = new Scanner(file);
                //Lanza fileNotFoundException
                //Leer cadenas de caracteres del mismo
                String leer = file_lectura.nextLine();
                //Lanza IlegalStateException
                //NoSuchElementException
                String leer2 = file_lectura.nextLine();
                String leer3 = file_lectura.nextLine();
                //Intentar convertir una cadena
                //a su tipo de dato original
                double leer_double;
                int leer_int;
                leer_double=Double.parseDouble(leer2);
                //Lanzar NumberFormatException
                leer_int = Integer.parseInt(leer3);
                //Mostrar consola con la diversas cadenas
                System.out.println("La cadena leida es : "+leer);
                System.out.println("La cadena leida es : "+leer_double);
                System.out.println("La cadena leida es : "+leer_int);
            }else{
                //El archivo SI existe
                System.out.println("El archivo ya existe y por lo tanto NO se crea");
            }
        }catch(FileNotFoundException f_exception){
            //Esta excepcion surge solo si no encuentra el archivo
            System.out.println("Las operaciones de lectura NO sean podido realizar");
            System.out.println("Ha ocurrido un problema al buscar el archivo para lectura");
            System.out.println(f_exception.toString());
        }catch(IOException io_exception){
            //Esta excepcion puede surgir en alguna de las operaciones de escritura
            System.out.println("Ha ocurrido un ERROR en la E/S de datos");
            System.out.println(io_exception.toString());
        }catch(NumberFormatException nb_exception){
        //La excepcion ocurre al intentar realizar una conversion 
        //de una cadena de caracteres a un tipo numerico
            System.out.println("Ha ocurrido un error de conversion de caracteres a numeros ");
            System.out.println(nb_exception.toString());
        }catch(NoSuchElementException nse_exception){
        //Ocurre cuando el metodo nextLine()no encuentra una cadena 
            System.out.println("No se ha podido encontrar al elemto en el Scanner");
            System.out.println(nse_exception.toString());
        }catch(Exception e_exception){
            //Permite capturar cual excepcion
            System.out.println(e_exception.toString());
        }
    }
    
}
