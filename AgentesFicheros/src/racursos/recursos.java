/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racursos;

import agentesficheros.Agentes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
}
