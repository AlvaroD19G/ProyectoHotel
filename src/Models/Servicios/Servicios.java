package Models.Servicios;

import Models.ServicioManajer;
import java.util.HashMap;
import java.util.Map;


public class Servicios implements ServicioManajer{
    private Map<Integer, Servicios> servicios = new HashMap<>();
    private int    codigoServicio;
    private String nombre;
    private String descripcion;
    private double precio;

    public Servicios(int codigoServicio, String nombre, String descripcion, double precio) {
        this.codigoServicio = codigoServicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

   

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void agregarServicio(Servicios servicio) {
        servicios.put(servicio.getCodigoServicio(), servicio);
    }
    

    @Override
    public void actualizarServicio(int codigoServicio, Servicios servicioActualizado, String descripcion, double precio) {
        if (servicioActualizado != null) {
         servicioActualizado.setDescripcion(descripcion);
         servicioActualizado.setPrecio(precio);
        }
    }

    @Override
    public void eliminarServicio(int codigoServicio) {
         servicios.remove(codigoServicio);
    }

    @Override
    public Servicios buscarServicio(int codigoServicio) {
         return servicios.get(codigoServicio);
    }
    
}

  

