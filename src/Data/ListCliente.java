/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Models.Clientes.Clientes;
import Models.List;
import java.util.HashMap;

/**
 *
 * @author uno
 */
public class ListCliente implements List<Clientes> {

    private static ListCliente listClientes;

    public static ListCliente getInstance() {
        if (listClientes == null) {
            listClientes = new ListCliente();
        }
        return listClientes;

    }

    
    HashMap<String, Clientes> clientes;

    private ListCliente() {
        this.clientes = new HashMap<>();
    }

    @Override
    public boolean insert(Clientes obj) {
        this.clientes.put(obj.getIdentificacion(), obj);
        return true;
    }

    @Override
    public boolean update(Clientes obj) {
        return this.insert(obj);
    }

    
    @Override
    public boolean delete(Clientes obj) {
        obj=this.search(obj.getIdentificacion());
        return this.clientes.remove(obj.getIdentificacion(), obj);
    }

    @Override
    public Clientes search(Object id) {
        return this.clientes.get(id.toString());
    }

    @Override
    public Clientes[] toArray() {
        return this.clientes.values().toArray(new Clientes[0]);
    }
   
}
