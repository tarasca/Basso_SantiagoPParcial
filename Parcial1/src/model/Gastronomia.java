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
public class Gastronomia extends Servicio{
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public String getGastronomia() {
        return this.gastronomia;
    }
    public void setGastronomia(String gastronomia) {
        this.gastronomia = gastronomia;
    }

    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDiaSemDesc() {
        return this.diaSemDesc;
    }
    public void setDiaSemDesc(int diaSemDesc) {
        this.diaSemDesc = diaSemDesc;
    }
    
    public Gastronomia(String codigo, double descuento, boolean promo, String gastronomia, double precio, int diaSemDesc){
        this.codigo = codigo;
        this.descuento = descuento;
        this.promo = promo;
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gastronomia{");
        sb.append("codigo=").append(this.codigo);
        sb.append(", descuento=").append(this.descuento);
        sb.append(", promo=").append(promo);
        sb.append(", gastronomia=").append(this.gastronomia);
        sb.append(", precio=").append(this.precio);
        sb.append(", diaSemDesc=").append(this.diaSemDesc);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public double calcularPrecioFinal(LocalDate dias){
        if(this.promo && dias.getDayOfWeek().getValue() == this.diaSemDesc){
            this.fecha = dias;
            return ((this.precio * dias.getDayOfYear())
                    - (this.precio * dias.getDayOfYear()) * this.descuento);
        }
        else{
            this.fecha = dias;
            return (this.precio * dias.getDayOfYear());
        }
    }
}
