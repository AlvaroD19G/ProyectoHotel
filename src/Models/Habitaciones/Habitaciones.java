/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Habitaciones;

/**
 *
 * @author Usuario
 */
public class Habitaciones {
  private int numeroHabitacion;
   private String tipo;
   private double precio; 

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    public Habitaciones(int numeroHabitacion, String tipo, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.precio = precio;
    }
    
        public double calcularPrecioTotal(int numeroDias) {
        double precioTotal = precio * numeroDias;
        return precioTotal;
    }
 
}
