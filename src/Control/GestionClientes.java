/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Artista;
import Entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GestionClientes {
     private Cliente clientes;

    public GestionClientes() {
        
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
     
     
     
    public ArrayList<Cliente> ListaCliente(){
        
        ArrayList<Cliente> ListaClientes = new ArrayList<>();
        Cliente cliente1=new Cliente(2020,172093,"Pedro","Cortes","Calle 127D #18-23",8790432);
        ListaClientes.add(cliente1);
        Cliente cliente2 = new Cliente(2019, 182279,"Sara","Buitrago","Carrera 12 #98-10", 8754347);
        ListaClientes.add(cliente2);
        Cliente cliente3 = new Cliente(2018, 154436,"Simon","Perez","Calle 23 #17-3", 8723895);
        ListaClientes.add(cliente3);
        Cliente cliente4 = new Cliente(2017, 175693,"Sofia","Nieto","Avenida 15 #25-5",8712504);
        ListaClientes.add(cliente4);
        Cliente cliente5 = new Cliente(2016,113476,"Nicolas","Mora","Calle 93 #30-1", 8774532);
        ListaClientes.add(cliente5);
        Cliente cliente6 = new Cliente(2015,132675,"Hector","Ardila","Carrera 54 #23-8", 8738945);
        ListaClientes.add(cliente6);
        Cliente cliente7 = new Cliente(2014,195678,"Fernando","Torres","Calle 45 #78-43", 8729185);
        ListaClientes.add(cliente7);
        Cliente cliente8 = new Cliente(2013,113476,"Laura","Duque","Avenida 59 #34-76", 8798034);
        ListaClientes.add(cliente8);
        Cliente cliente9 = new Cliente(2012,148372,"Camila","Rueda","Calle 78 #45-32", 8751092);
        ListaClientes.add(cliente9);
        Cliente cliente10 = new Cliente(2016,113476,"David","Silva","Carrera 39 #54-61", 8780124);
        ListaClientes.add(cliente10);
        return ListaClientes;
        
        
    }
    
   
}

