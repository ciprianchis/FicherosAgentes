/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentesficheros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Agentes {
    protected String nombre;
    protected int edad;
    protected String direccion;
    protected int salario;
    protected String tipo;
    protected ArrayList<Agentes> vAgentes;

    public Agentes(String nombre, int edad, String direccion, int salario, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.salario = salario;
        this.tipo = tipo;
    }

    public static ArrayList informacionAgentes(){
        ArrayList<Agentes> vAgentes = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        for (Agentes agente : vAgentes) {
            if(leer.hasNext()){
                agente.toString();
            }
        }
    
        return vAgentes;
    }
    
    public static void añadirAgente(){
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nNombre=" + nombre + "\nEdad=" + edad + "\nDireccion=" + direccion + "\nSalario=" + salario;
    }
    
    
}
