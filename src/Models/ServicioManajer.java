
package Models;

import Models.Servicios.Servicios;


public interface ServicioManajer {
    void agregarServicio(Servicios servicio);
    Servicios buscarServicio(int codigoServicio);
    void actualizarServicio(int codigoServicio, Servicios servicioActualizado, String descripcion, double precio);
    void eliminarServicio(int codigoServicio);
}
