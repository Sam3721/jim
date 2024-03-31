/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author yerky vargas
 */
public class Rutina {

    public static void main(String[] args) {
    
    
        }
        public static List<String> crearRutina() {
        List<String> rutina = new ArrayList<>();
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        rutina.add("a");
        
        return rutina;
        
        }
        
       public static void mostrarRutina(List<String> rutina) {
        Collections.shuffle(rutina);

        // Iterar sobre la lista de 5 en 5
        int contador = 0;
        for (String elemento : rutina) {
            System.out.print(elemento + " ");
            contador++;
            // Imprimir un salto de línea después de cada grupo de 5 elementos
            if (contador % 5 == 0) {
                System.out.println();
            }
        }
    }
}


