/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author every
 */
public class Sistema {
    private ArrayList<Servicio> list_servicios;
    
    public Sistema(){
        this.list_servicios = new ArrayList<Servicio>();
    }

    public ArrayList<Servicio> getList_servicios() {
        return this.list_servicios;
    }
    public void setList_servicios(ArrayList<Servicio> list_servicios) {
        this.list_servicios = list_servicios;
    }
    
    public Servicio getServicio(String codService){
        Servicio ret = null;
        for(Servicio s : this.list_servicios){
            if(codService == s.codigo){
                ret = s;
            }
        }
        return ret;
    }
    
    public ArrayList<Servicio> getServicio(boolean enPromo){
        ArrayList<Servicio> ret = new ArrayList<Servicio>();
        for(Servicio s : this.list_servicios){
            if(s.isPromo()) ret.add(s);
        }
        return ret;
    }
    
    public ArrayList<Servicio> getServicio(boolean enPromo, LocalDate dia){
        ArrayList<Servicio> ret = new ArrayList<Servicio>();
        for(Servicio s : this.list_servicios){
            if(s.fecha == dia){ ret.add(s);}
        }
        return ret;
    }
    
    public boolean addGastronomia(String codServicio, double porcentajeDescuento, 
            boolean enPromocion, String gastronomia, double precio, int diaSemDesc){
        try{
            Gastronomia g = new Gastronomia(codServicio, porcentajeDescuento,
            enPromocion, gastronomia, precio, diaSemDesc);
            this.checkCodeServicio(g);
            this.list_servicios.add(g);
            return true;
        }
        catch(copiedServiceCodeException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean addHospedaje(String codServicio, double porcentajeDescuento, 
            boolean enPromocion, String hospedaje,double precioPorNoche){
        try{
            Hospedaje h = new Hospedaje(codServicio, porcentajeDescuento,
            enPromocion, hospedaje, precioPorNoche);
            this.checkCodeServicio(h);
            this.list_servicios.add(h);
            return true;
        }
        catch(copiedServiceCodeException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public void checkCodeServicio(Servicio serv) throws copiedServiceCodeException{
        for(Servicio s : this.list_servicios){
            if(serv.codigo == s.codigo) throw new  copiedServiceCodeException("codigo de servico repetido.");
        }
    }
}
