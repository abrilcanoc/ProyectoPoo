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
    private GestionObras gestionObras;
    private GestionClientes gestionClientes;
    private ArrayList<Obra> listaObras;
    private ArrayList<Artista> listaArtistas;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Compra> Compras;

    public ControlGaleria() {
        this.listaObras = gestionObras.ListaObras();
        this.listaClientes = gestionClientes.ListaCliente();
        this.listaArtistas= new ArrayList<>();

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
    public boolean ExisteArtista(Artista art){
        for (Artista a: listaArtistas){
            if(a.getCedula()==art.getCedula()){
                return true;
            }
        }
        return false;
    }
    public boolean ExisteObra(long cod){
        for(Obra o: listaObras){
            if(o.getCodigoObra()==cod)
                return true;
        }
        return false;
    }
    
    public Obra BuscarObra(long cod){
        for (Obra o: listaObras){
            if(o.getCodigoObra()==cod)
                return o;
        }
        return null;
    }
    
    public boolean insertarObra(Obra obra){
        for (Artista a: obra.getArtistas()){
            if(!ExisteArtista(a))
                listaArtistas.add(a);
        }
        if(ExisteObra(obra.getCodigoObra()))
            return false;
        String cod= Integer.toString(obra.getCodigoObra());
        if(cod.length()!=7)
            return false;
        listaObras.add(obra);
        return true;
        
    }

    public boolean ModificarObra(long cod ){
        if(!ExisteObra(cod))
            return false;
        
        return true;
    }

   public Obra EliminarObra(long cod){
       if(!ExisteObra(cod)){
           return null;
       }
        return null; 
   }

    
    
    
}
