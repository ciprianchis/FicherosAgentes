/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racursos;

import agentesficheros.Agentes;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.FileDataSource;

/**
 *
 * @author alumno
 */
public class recursos {
    public static ArrayList<Agentes> leerAgentes(){
        ArrayList<Agentes> vAgentes = new ArrayList();
        File agente = new File("Recursos/agente.txt");
        
        if (!agente.exists()) {
            try {
                agente.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");
            }
            
        }
        
        return vAgentes;       
    }
    
    
    public static ArrayList<String> leerPisos(){
        ArrayList<String> vPisos = new ArrayList();
        File agente = new File("Recursos/Pisos.txt");
        
        if (!agente.exists()) {
            try {
                agente.getParentFile().mkdir();
                agente.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");
            }
            
         
            try {
                Scanner leer = new Scanner(agente);
                while(leer.hasNext()){
                    String linea;
                    
                    linea = leer.nextLine();
                    vPisos.add(linea);
                    
                }
             
                
            } catch (FileNotFoundException ex) {
                System.out.println("Error al leer el fichero");
            }
            
            
        }
        
        return leerPisos();       
    }
}
