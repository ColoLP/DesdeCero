/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

public class Persona 
{
    //Attributes
    private int idPersona;
    private String nombre;
    private int edad;
    private String correo;
    private int pais;
    
    //Constructors
    public Persona() 
    {
        
    }

  

    public Persona(String nombre, int edad, String correo,int pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.pais = pais;
    }
    //Properties
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }
    //Methods
    
}
