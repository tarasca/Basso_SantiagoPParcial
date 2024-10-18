/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author every
 */
public abstract class Servicio {
    protected String codigo;
    protected double descuento;
    protected boolean promo;
    protected LocalDate fecha;
    
    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getDescuento() {
        return this.descuento;
    }
    public void setDescuento(double descuento) {
        if(descuento > 0 && descuento < 1)this.descuento = descuento;
    }

    public boolean isPromo() {
        return this.promo;
    }
    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
    public abstract double calcularPrecioFinal(LocalDate dia);

    
}
