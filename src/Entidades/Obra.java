/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author ASUS
 */
public class Obra {
    private long codigoObra;
    private String titulo;
    private Calendar fecha;
    private float precioRef;
    private String dimensiones;
    private ArrayList<Artista> Artistas;

    public Obra() {
    }

    public Obra(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones, Compra compraObra) {
        this.codigoObra = codigoObra;
        this.titulo = titulo;
        this.fecha = fecha;
        this.precioRef = precioRef;
        this.dimensiones = dimensiones;
        this.Artistas=new ArrayList<>();
    }

    public Obra(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones) {
        this.codigoObra = codigoObra;
        this.titulo = titulo;
        this.fecha = fecha;
        this.precioRef = precioRef;
        this.dimensiones = dimensiones;
        this.Artistas = new ArrayList<>(); 
    }
    
    public Obra(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones, ArrayList<Artista> Artistas) {
        this.codigoObra = codigoObra;
        this.titulo = titulo;
        this.fecha = fecha;
        this.precioRef = precioRef;
        this.dimensiones = dimensiones;
        this.Artistas = new ArrayList<>();
    }

    public long getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(long codigoObra) {
        this.codigoObra = codigoObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getPrecioRef() {
        return precioRef;
    }

    public void setPrecioRef(float precioRef) {
        this.precioRef = precioRef;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public ArrayList<Artista> getArtistas() {
        return Artistas;
    }

    public void setArtistas(ArrayList<Artista> Artistas) {
        this.Artistas =  new ArrayList<>();
    }
    
   
}
