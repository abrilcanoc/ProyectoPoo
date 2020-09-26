/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary;

import Control.ControlGaleria;
import Entidades.Cliente;
import Entidades.Compra;
import Entidades.Obra;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PantallaGaleria {

    /**
     * @param args the command line arguments
     */
    private ControlGaleria controlGaleria;
    
    public PantallaGaleria (){
        controlGaleria= new ControlGaleria();
    }
    
    public static void main(String[] args) {
        PantallaGaleria pantalla =new PantallaGaleria();
        
        int m = menu();
        Scanner sc = new Scanner(System.in);
        while (m!=15){
            if (m==1){
                ArrayList<Obra> ob= new ArrayList();
                ob=pantalla.controlGaleria.obrasDisponibles();
                System.out.println("Obras Disponibles:");
                for (Obra o: ob){
                     System.out.println(" Titulo: "+o.getTitulo());
                     System.out.println(" Fecha creacion: "+o.getFecha());
                     System.out.println(" Precio de referencia: "+o.getPrecioRef());
                     System.out.println(" Dimensiones"+ o.getDimensiones());
                     System.out.println(" __________________________________");
                } 
            }
            if (m==2){
                int op=0;
                ArrayList <Obra> resultados=new ArrayList<>();
                System.out.println("Bajo que criterio desea buscar");
                System.out.println("1. Titulo");
                System.out.println("2. Artista");
                System.out.println("3. Año");
                op= sc.nextInt();
                if (op ==1){
                    System.out.println("Ingrese el titulo a buscar");
                    String titulo=sc.next();
                    resultados=pantalla.controlGaleria.BuscarObra(titulo);
                }
                if (op==2){
                    System.out.println("Ingrese el codigo del artista a buscar");
                    long cod=sc.nextLong();
                    resultados=pantalla.controlGaleria.BuscarObraA(cod);
                }
                if (op==3){
                    System.out.println("Ingrese el año a buscar");
                    int año=sc.nextInt();
                    resultados=pantalla.controlGaleria.BuscarObra(año);
                }
                for (Obra o: resultados){
                     System.out.println(" Titulo: "+o.getTitulo());
                     System.out.println(" Fecha creacion: "+o.getFecha());
                     System.out.println(" Precio de referencia: "+o.getPrecioRef());
                     System.out.println(" Dimensiones"+ o.getDimensiones());
                     System.out.println(" __________________________________");
                }  
            }
            // Como pasar el calendar y como saber cuantos artistas
            if (m==3){
                System.out.println("Escriba el titulo de la obra ");
                String titulo= sc.next();
                System.out.println("Escriba el codigo de la obra");
                long cod=sc.nextInt();
                System.out.println("Escriba el precio de referencia");
                float precio =sc.nextFloat();
                System.out.println("Escriba las dimensiones de la obra");
                String dim=sc.next();
                
            }
            //Modificar artistas?
            if (m==4){
                System.out.println("Inserte el codigo de la obra que desea modificar");
                long cod=sc.nextLong();
                System.out.println("¿Que desea modficar?:");
                System.out.println("1. Titulo");
                System.out.println("2. Codigo");
                System.out.println("3. Fecha de creacion");
                System.out.println("4. Precio de referencia");
                System.out.println("5. Dimensiones");
                int op=sc.nextInt();
                if(op==1){
                    System.out.println("Escriba el nuevo Titulo");
                    String titulo= sc.next();
                    if (pantalla.controlGaleria.ModifcarObra(cod, titulo))
                        System.out.println("Modificada");
                }
                if(op==2){
                    System.out.println("Escriba el nuevo codigo");
                    long codN= sc.nextLong();
                    if (pantalla.controlGaleria.ModifcarObra(cod,codN))
                        System.out.println("Modificada");
                }
                /*
                if(op==3){
                    System.out.println("Escriba la nueva fecha");
                    String titulo= sc.next();
                    if (pantalla.controlGaleria.ModifcarObra(cod, titulo))
                        System.out.println("Modificada");
                }
                */
                if (op==4){
                    System.out.println("Escriba el nuevo precio de referencia");
                    float precio= sc.nextFloat();
                    if (pantalla.controlGaleria.ModifcarObra(cod,precio))
                        System.out.println("Modificada");
                }
                if (op==4){
                    System.out.println("Escriba las nuevas dimensiones");
                    String dim= sc.next();
                    if (pantalla.controlGaleria.ModifcarObra(dim,cod))
                        System.out.println("Modificada");
                }   
            }
            if(m==5){
                System.out.println("Escriba el codigo de la obra que quiere eliminar");
                long cod=sc.nextLong();
                Obra obraE= pantalla.controlGaleria.EliminarObra(cod);
                if (obraE==null)
                    System.out.println("No existe la obra a eliminar");
                if(obraE!=null){
                    System.out.println("Obra eliminada:");
                    System.out.println("titulo: "+obraE.getTitulo());
                    System.out.println("codigo: "+obraE.getCodigoObra());

                }
            }
            if (m==6){
                ArrayList<Cliente> cli= new ArrayList();
                cli=pantalla.controlGaleria.VerListadoClientes();
                System.out.println("Cliente:");
                for (Cliente c: cli){
                     System.out.println(" Nombre: "+ c.getNombre());
                     System.out.println(" Apellido: "+c.getApellidos());
                     System.out.println(" Direccion:"+c.getDireccionEntrega());
                     System.out.println(" Cedula: "+ c.getCedula());
                     System.out.println(" Codigo: "+ c.getCodigoCliente());
                     System.out.println(" Telefono: "+ c.getTelefono());
                     System.out.println(" __________________________________");
                }
            }
            if(m==7){
                System.out.println("Escriba el nombre del cliente ");
                String Nombre= sc.next();
                System.out.println("Escriba el apellido del cliente ");
                String Apellido= sc.next();
                System.out.println("Escriba el codigo del cliente");
                long cod=sc.nextLong();
                System.out.println("Escriba la cedula del cliente");
                long ced=sc.nextLong();
                System.out.println("Escriba la direccion  del cliente");
                String dir=sc.next();
                System.out.println("Escriba el telefono del cliente");
                long tel=sc.nextLong();
                Cliente cliente=  new Cliente(cod,ced,Nombre,Apellido, dir, tel);
                if(pantalla.controlGaleria.InsertarCliente(cliente)){
                    System.out.println("Insertado");
                }
                else
                    System.out.println("No se pudo insertar");
            }
            if (m==8){
                System.out.println("Ingresa el codigo del cliente que desea modificar");
                long cod=sc.nextLong();
                System.out.println("¿Que desea modficar?:");
                System.out.println("1. Codigo");
                System.out.println("2. Cedula");
                System.out.println("3. Nombre");
                System.out.println("4. Apellido");
                System.out.println("5. Direccion");
                System.out.println("6. Telefono");
                int op=sc.nextInt();
                if(op==1){
                    System.out.println("Ingrese el nuevo Codigo");
                    long codN=sc.nextLong();
                    if(pantalla.controlGaleria.ModificarCliente(cod, codN))
                        System.out.println("Modificado");
                }
                if(op==2){
                    System.out.println("Ingrese la nueva cedula");
                    long ced=sc.nextLong();
                    if(pantalla.controlGaleria.ModificarClienteC(cod, ced))
                        System.out.println("Modificado");
                }
                if(op==3){
                    System.out.println("Ingrese el nuevo Nombre");
                    String nom=sc.next();
                    if(pantalla.controlGaleria.ModificarCliente(cod, nom))
                        System.out.println("Modificado");
                }
                if(op==4){
                    System.out.println("Ingrese el nuevo Apellido");
                    String ap=sc.next();
                    if(pantalla.controlGaleria.ModificarCliente(ap, cod))
                        System.out.println("Modificado");
                }
                if(op==5){
                    System.out.println("Ingrese la nueva direccion");
                    String dir=sc.next();
                    if(pantalla.controlGaleria.ModificarClienteD(cod, dir))
                        System.out.println("Modificado");
                }
                if(op==6){
                    System.out.println("Ingrese el nuevo telefono");
                    long tel=sc.nextLong();
                    if(pantalla.controlGaleria.ModificarClienteT(cod, tel))
                        System.out.println("Modificado");
                }
                
            }
            if(m==9){
                 System.out.println("Escriba el codigo del cliente que quiere eliminar");
                long cod=sc.nextLong();
                Cliente clienteE= pantalla.controlGaleria.EliminarCliente(cod);
                if (clienteE==null)
                    System.out.println("No existe la obra a eliminar");
                if(clienteE!=null){
                    System.out.println("Cliente eliminado:");
                    System.out.println("Nombre: "+clienteE.getNombre());
                    System.out.println("Apellido: "+clienteE.getApellidos());
                    System.out.println("codigo: "+clienteE.getCodigoCliente());

                }
            }
            if (m==10){
                System.out.println("Digite el codigo del cliente ");
                long codC=sc.nextLong();
                System.out.println("Digite el codigo de la obra");
                long codO=sc.nextLong();
                long CodCompra=pantalla.controlGaleria.RealizarCompra(codC, codO);
                if(CodCompra!=0)
                    System.out.println("Compra registrada, Numero de compra: "+ CodCompra);
                else
                    System.out.println("No se pudo registar la compra");
                
            }
            if (m==11){
                System.out.println("Inserte el numero de compra que desea eliminar");
                long codCompra=sc.nextLong();
                Compra compra=pantalla.controlGaleria.EliminarCompra(codCompra);
                if(compra==null)
                    System.out.println("No se pudo eliminar la compra");
                else{
                    System.out.println("Compra eliminada:");
                    System.out.println("Codigo compra: "+compra.getCodigoCompra());
                    System.out.println("Cliente: "+compra.getCompraCliente().getNombre());
                    System.out.println("Obra: "+compra.getCompraObra().getTitulo());
                }
                if(m==12){
                    ArrayList<Compra> comp= new ArrayList();
                    comp=pantalla.controlGaleria.VerListadoCompra();
                    System.out.println("Compras Existentes: ");
                    for (Compra c: comp){
                        System.out.println("Codigo compra: "+c.getCodigoCompra());
                        System.out.println("Cliente: "+c.getCompraCliente().getNombre());
                        System.out.println("Obra: "+c.getCompraObra().getTitulo());
                        System.out.println("__________________________________");
                    } 
                }
                if (m==13){
                    System.out.println("Ingrese el año para el cual desea buscar las compras realizadas");
                    int a=sc.nextInt();
                    System.out.println("Ingrese el mes");
                    int mes=sc.nextInt();
                    ArrayList<Compra> comprasR=new ArrayList<>();
                    comprasR=pantalla.controlGaleria.ComprasMesAño(mes, a);
                    for (Compra c: comprasR){
                        System.out.println("Codigo compra: "+c.getCodigoCompra());
                        System.out.println("Cliente: "+c.getCompraCliente().getNombre());
                        System.out.println("Obra: "+c.getCompraObra().getTitulo());
                        System.out.println("__________________________________");
                    } 
                }
                if(m==14){
                    
                }
            }
        }
        
    }
        public static int menu(){
           Scanner sc =new Scanner(System.in);
           System.out.println("1. Ver listado de obras disponibles");
           System.out.println("2. Buscar una obra por titulo, año o artista");
           System.out.println("3. Insertar una obra");
           System.out.println("4. Modificar una obra");
           System.out.println("5. Eliminar una Obra");
           System.out.println("6. Ver listado de clientes");
           System.out.println("7. Insertar cliente");
           System.out.println("8. Modificar datos cliente");
           System.out.println("9. Eliminar un cliente");
           System.out.println("10. Realizar Compra de una obra");
           System.out.println("11. Eliminar compra de obra");
           System.out.println("12. Ver listado de compras existentes");
           System.out.println("13. Ver listado de compras especifico");
           System.out.println("14. Ver listado de artistas mas vendidos");
           System.out.println("15. Salir");
           int m = sc.nextInt();
        return m;
    }
          
}
