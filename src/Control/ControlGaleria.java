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
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class ControlGaleria {
    private ArrayList<Obra> listaObras;
    private ArrayList<Artista> listaArtistas;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Compra> listaCompras;

    public ControlGaleria() {
        this.listaArtistas= new ArrayList<>();
        this.listaClientes=new ArrayList<>();
        this.listaObras=new ArrayList<>();
        this.listaCompras=new ArrayList<>();
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
    
    public boolean ExisteCliente(long cod){
        for(Cliente c: listaClientes){
            if(c.getCodigoCliente()==cod){
                return true;
            }
        }
        return false;
    }
    public boolean ExisteCompra(long cod){
        for(Compra c: listaCompras){
            if (c.getCodigoCompra()==cod){
                return true;
            }
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
    public Cliente BuscarCliente(long cod){
        for (Cliente c: listaClientes){
            if(c.getCodigoCliente()==cod)
                return c;
        }
        return null;
    }
    public Compra BuscarCompra(long cod){
        for(Compra c:listaCompras){
            if(c.getCodigoCompra()==cod)
                return c;
        }
        return null;
    }
    
    public ArrayList<Obra> obrasDisponibles (){
        ArrayList<Obra> obrasDisp =new ArrayList<>();
        boolean disp=true;
        for(Obra o: listaObras){
            for(Compra c: listaCompras){
                if(c.getCompraObra()==o){
                    disp=false;
                }
            }
            if (disp)
                obrasDisp.add(o);
        }
        return obrasDisp;
    }
    
    public ArrayList<Obra> BuscarObra (String titulo){
        ArrayList<Obra> resultados =new ArrayList<>();
        resultados= null;
        for (Obra o : listaObras){
            if (o.getTitulo()==titulo){
                resultados.add(o);
            }
        }
        return resultados;
    }
    
    public ArrayList<Obra> BuscarObra(Artista art){
        ArrayList<Obra> resultados =new ArrayList<>();
        resultados= null;
        for (Obra o : listaObras){
            for(Artista a : o.getArtistas()){
                if(a.getCodigoArtista()==art.getCodigoArtista()){
                    resultados.add(o);
                }
            }
        }
        return resultados;      
    }
    
    public ArrayList<Obra> BuscarObra(int año){
        ArrayList<Obra> resultados= new ArrayList<>();
        resultados= null;
        for (Obra o: listaObras){
            if (o.getFecha().get(Calendar.YEAR)==año){
                resultados.add(o);
            }
        }
        return resultados;
    }
    
    public boolean insertarObra(Obra obra){
        for (Artista a: obra.getArtistas()){
            if(!ExisteArtista(a))
                listaArtistas.add(a);
        }
        if(ExisteObra(obra.getCodigoObra()))
            return false;
        String cod= String.valueOf(obra.getCodigoObra());
        if(cod.length()!=7)
            return false;
        listaObras.add(obra);
        return true;
       
    }

    public boolean ModificarObra(long cod, long codN){
        if(!ExisteObra(cod))
            return false;
        if(BuscarObra(codN)==null){
            BuscarObra(cod).setCodigoObra(codN);
             return true;
        }
        return false;
    }
    
    public boolean ModifcarObra( long cod,String titN){
        if(!ExisteObra(cod))
            return false;
        BuscarObra(cod).setTitulo(titN);
        return true;
    }
    
    public boolean ModifcarObra( long cod, Calendar fechaN){
        if(!ExisteObra(cod))
            return false;
        BuscarObra(cod).setFecha(fechaN);
        return true;
    }
    
    public boolean ModifcarObra( long cod, float PrecioN){
        if(!ExisteObra(cod))
            return false;
        BuscarObra(cod).setPrecioRef(PrecioN);
        return true;
    }
    
    public boolean ModifcarObra( String dim, long cod){
        if(!ExisteObra(cod))
            return false;
        BuscarObra(cod).setDimensiones(dim);
        return true;
    }
    

   public Obra EliminarObra(long cod){
       if(!ExisteObra(cod)){
           return null;
       }
       Obra obraRet= BuscarObra(cod);
       listaObras.remove(BuscarObra(cod));
       return obraRet;
   }
   
   public ArrayList<Cliente> VerListadoClientes(){
       return listaClientes;
   }
   
   public boolean InsertarCliente(Cliente cliente){
       if(ExisteCliente(cliente.getCodigoCliente()))
           return false;
       listaClientes.add(cliente);
       return true;
   }
   
   public boolean ModificarCliente(long cod, long codN){
       if(!ExisteCliente(cod))
            return false;
        if(BuscarCliente(codN)==null){
            BuscarCliente(cod).setCodigoCliente(codN);
             return true;
        }
        return false;
    }
   public boolean ModificarCliente(long cod,long ced,boolean nada){
       if(!ExisteCliente(cod))
            return false;
       BuscarCliente(cod).setCedula(ced);
       return true;
    }
   public boolean ModificarCliente(long cod,String nombre){
       if(!ExisteCliente(cod))
            return false;
       BuscarCliente(cod).setNombre(nombre);
       return true;
    }
   public boolean ModificarCliente(String apellido, long cod){
       if(!ExisteCliente(cod))
            return false;
       BuscarCliente(cod).setApellidos(apellido);
       return true;
    }
   public boolean ModificarCliente(long cod,String direccion, boolean nada){
       if(!ExisteCliente(cod))
            return false;
       BuscarCliente(cod).setDireccionEntrega(direccion);
       return true;
    }
   public boolean ModificarCliente(long cod,boolean nada,long tel){
       if(!ExisteCliente(cod))
            return false;
       BuscarCliente(cod).setTelefono(tel);
       return true;
    }
   public Cliente EliminarCliente(long cod){
       if(!ExisteCliente(cod))
           return null;
       
        Cliente ClienteRet= BuscarCliente(cod);
        listaObras.remove(BuscarCliente(cod));
        return ClienteRet;
   
   }
   public boolean RealizarCompra(long codCli, long codOb){
       if(!ExisteCliente(codCli)&& !ExisteObra(codOb))
           return false; 
       Random rand = new Random(); 
       int Cod = rand.nextInt(1000);
       if(ExisteCompra(Cod))
           return false;
       Calendar today = Calendar.getInstance();
       Compra comp= new Compra(Cod, today, false);
       listaCompras.add(comp);
       
       return true;  
   }
   
   public Compra EliminarCompra(long num){
       if(!ExisteCompra(num))
           return null;
       Compra compra=BuscarCompra(num);
       listaCompras.remove(compra);
       return compra;
       
   }
   
   public ArrayList<Compra> VerListadoCompra(){
       return listaCompras;
   }
   
   public ArrayList<Compra> ComprasMesAño(int mes, int año){
      ArrayList<Compra> resultados= new ArrayList<>();
      for(Compra c: listaCompras){
          if(c.getFecha().get(Calendar.MONTH)==mes && c.getFecha().get(Calendar.YEAR)== año){
              listaCompras.add(c);
          }
      }
       return resultados;
    }
}

