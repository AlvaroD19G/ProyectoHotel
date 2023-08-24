/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Clientes;

import Controlador.Controlador;
import Data.ListCliente;
import Models.Clientes.Clientes;
import Vista.Vista;



/**
 *
 * @author uno
 */
public class ControladorClientes implements Controlador<Clientes> {

    private ListCliente list;
    private Vista vista;

    public ListCliente getList() {
        return list;
    }

    public void setList(ListCliente list) {
        this.list = list;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public ControladorClientes(Vista vista) {
        list = ListCliente.getInstance();
        this.vista = vista;
    }
    
    
    @Override
    public void insert(Clientes obj) {
        if (obj.isComplete()) {
            this.list.insert(obj);
            this.readAll();
        } else {
            this.vista.displayErrorMessage("Faltan datos");
        }
    }
    
    @Override
    public void update(Clientes obj) {
        if (obj.isComplete()){
            this.list.update(obj);
            this.readAll();
        }else{
            this.vista.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void delete(Clientes obj) {
        if (this.list.delete(obj)){
            this.readAll();
        }else{
            this.vista.displayErrorMessage("El miembro no se encuentra registrado");
        }
    }

    @Override
    public void read(Object id) {
        Clientes clientes=this.list.search(id);
        if (clientes!=null){
            this.vista.display(clientes);
        }else{
            this.vista.displayErrorMessage("El miembro buscado no se encuentra registrado");
        }
    }

    @Override
    public void readAll() {
        Clientes[] members=this.list.toArray();
        if (members.length>0){
            this.vista.displayAll(members);
        }
    }

    @Override
    public Clientes[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
