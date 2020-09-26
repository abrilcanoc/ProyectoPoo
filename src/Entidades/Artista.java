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
public class Artista {
    private long codigoArtista;
    private long cedula;
    private String nombre;
    private String apellidos;
    private Calendar fechaNacimiento;
    private long telefono;
    private int ObrasVendidas;
    private ArrayList<Obra> Obras;

    public Artista() {
    }

    public Artista(long codigoArtista, long cedula, String nombre, String apellidos, Calendar fechaNacimiento, long telefono, int ObrasVendidas) {
        this.codigoArtista = codigoArtista;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.ObrasVendidas= ObrasVendidas;
        this.Obras=new ArrayList<>();
    }

    public Artista(long codigoArtista, long cedula, String nombre, String apellidos, Calendar fechaNacimiento, long telefono, int ObrasVendidas, ArrayList<Obra> Obras) {
        this.codigoArtista = codigoArtista;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.ObrasVendidas= ObrasVendidas;
        this.Obras = new ArrayList<>();
    }

    public long getCodigoArtista() {
        return codigoArtista;
    }

    public void setCodigoArtista(long codigoArtista) {
        this.codigoArtista = codigoArtista;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getObrasVendidas() {
        return ObrasVendidas;
    }

    public void setObrasVendidas(int ObrasVendidas) {
        this.ObrasVendidas = ObrasVendidas;
    }

    public ArrayList<Obra> getObras() {
        return Obras;
    }

    public void setObras(ArrayList<Obra> Obras) {
        this.Obras = new ArrayList<>();
    }
     
  
    
    
}
