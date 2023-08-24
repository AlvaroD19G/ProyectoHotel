/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Clientes;

import Models.Entity;

/**
 *
 * @author Usuario
 */
public class Clientes implements Entity  {
    private String identificacion;
    private String nombre;
    private String telefono;
    private String correo;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

     public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    public Clientes(String identificacion) {
        this(identificacion,"","", "");
    }

    /**
     *
     * @param identificacion
     * @param nombre
     * @param correo
     */
    public Clientes(String identificacion, String nombre, String correo) {
        this(identificacion, nombre,"", correo);
    }
    
    public Clientes(String identificacion, String nombre, String telefono, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
        @Override
    public String toString() {
        return "Clientes{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

    @Override
    public boolean isComplete() {
         return !this.identificacion.equals("") && !this.nombre.equals("") &&!this.correo.equals("");
    }

    @Override
    public Object[] toArrayObject() {
        return new Object[]{this.identificacion,this.nombre,this.telefono,this.correo.toString()};
    }
   
    
}
