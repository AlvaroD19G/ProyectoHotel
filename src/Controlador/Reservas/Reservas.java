/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Usuario
 */
public class Reservas {
    private int numeroReserva;
    private String fechaEntrada;
    private String fechaSalida;
    private String estado;
    private int duracion;
    private double precio;
    
    public Reservas(int numeroReserva, String fechaEntrada, String fechaSalida, String estado, int duracion, double precio) {
        this.numeroReserva = numeroReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.duracion = duracion;
        this.precio = precio;
    }

}
