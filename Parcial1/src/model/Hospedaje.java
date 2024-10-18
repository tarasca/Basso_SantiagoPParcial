/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 * clase hospedaje heredada de servicio, incluye campo hospedaje para nombre y precioNoche para el precio
 * sobreescribe metodo calcularPrecioFinal, en dias de semana se aplica descuento
 * @author every
 */
public class Hospedaje extends Servicio {
    private String hospedaje;
    private double precioNoche;

    public String getHospedaje() {
        return this.hospedaje;
    }
    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public double getPrecioNoche() {
        return this.precioNoche;
    }
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }
    
    public Hospedaje(String codigo, double descuento, boolean promo, String hospedaje, double precioNoche){
        this.codigo = codigo;
        this.descuento = descuento;
        this.promo = promo;
        this.hospedaje = hospedaje;
        this.precioNoche = precioNoche;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospedaje{");
        sb.append("codigo=").append(this.codigo);
        sb.append(", descuento=").append(this.descuento);
        sb.append(", promo=").append(this.promo);
        sb.append(", hospedaje=").append(this.hospedaje);
        sb.append(", precioNoche=").append(this.precioNoche);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public double calcularPrecioFinal(LocalDate dias){
        if(this.promo && 
                (dias.getDayOfWeek().name() != "sabado" || dias.getDayOfWeek().name() != "domingo"))
        {
            this.fecha = dias;
            return ((this.precioNoche * dias.getDayOfYear())
                    - (this.precioNoche * dias.getDayOfYear()) * this.descuento);
        }
        else{
            this.fecha = dias;
            return (this.precioNoche * dias.getDayOfYear());
        }
    }
    
}
