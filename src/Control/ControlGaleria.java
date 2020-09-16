/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidades.Artista;
import Entidades.Cliente;
import Entidades.Compra;
import Entidades.Obra;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ControlGaleria {
    private ArrayList<Obra> listaObras;
    private ArrayList<Artista> listaArtistas;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Compra> Compras;

    public ControlGaleria(ArrayList<Obra> listaObras) {
        this.listaObras = new ArrayList<>();
    }
    
    public ArrayList<Obra> obrasDisponibles (){
        ArrayList<Obra> obrasDisp =new ArrayList<>();
        for (Obra o : listaObras){
            if (o.getCompraObra()==null){
                obrasDisp.add(o);
            }
        }
        return obrasDisp;
    }
    
    public ArrayList<Obra> BuscarObra (String criterio){
        ArrayList<Obra> resultados =new ArrayList<>();
        for (Obra o : listaObras){
            if (o.getTitulo()==criterio){
                resultados.add(o);
            }
        }
        return resultados;
    }


   

    
    
    
}
