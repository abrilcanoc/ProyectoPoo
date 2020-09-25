/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Calendar;

/**
 *
 * @author ASUS
 */
public class Compra {
    private long codigoCompra;
    private Calendar fecha;
    private boolean pagado;
    private Cliente CompraCliente;
    private Obra CompraObra;

    public Compra(long codigoCompra, Calendar fecha, boolean pagado, Cliente CompraCliente, Obra CompraObra) {
        this.codigoCompra = codigoCompra;
        this.fecha = fecha;
        this.pagado = pagado;
        this.CompraCliente = CompraCliente;
        this.CompraObra = CompraObra;
    }

    public Compra(long codigoCompra, Calendar fecha, boolean pagado) {
        this.codigoCompra = codigoCompra;
        this.fecha = fecha;
        this.pagado = pagado;
    }

    public long getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(long codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Cliente getCompraCliente() {
        return CompraCliente;
    }

    public void setCompraCliente(Cliente CompraCliente) {
        this.CompraCliente = CompraCliente;
    }

    public Obra getCompraObra() {
        return CompraObra;
    }

    public void setCompraObra(Obra CompraObra) {
        this.CompraObra = CompraObra;
    }
    
    
   
}
