/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Gastronomia;
import model.Hospedaje;
import model.Servicio;
import model.Sistema;

/**
 *
 * @author every
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sist = new Sistema();
        
        
        System.out.println("testing");
        System.out.println("1-1");
        Gastronomia g1 = new Gastronomia("4892", 0.15, true, "hamburguesa criolla", 180, 4);
        //System.out.println(g1.toString());
        
        System.out.println("1-2");
        Gastronomia g2 = new Gastronomia("489235", 0.15, true, "hambruguesa criolla", 180, 4);
        //System.out.println(g2.toString());
        
        System.out.println("1-3");
        Hospedaje h1 = new Hospedaje("2872", 0.1, true, "cabania 3 personas", 1500);
        //System.out.println(h1.toString());
        
        System.out.println("1-4");
        Hospedaje h2 = new Hospedaje("287282", 0.1, true, "cabania 3 persona", 1500);
        //System.out.println(h2.toString());
        
        System.out.println("2-1");
        System.out.println("precio final: " + g2.calcularPrecioFinal(LocalDate.of(2020, 10, 28)) );
        
        System.out.println("2-2");
        System.out.println("precio final: " + h2.calcularPrecioFinal(LocalDate.of(2020, 10, 27)) );
        
        System.out.println("3-*");
        sist.addGastronomia("858927", 0.15, true, "milanesa con pure", 350, 3);
        sist.addHospedaje("489259", 0.1, true, "habitacion triple", 2200);
        sist.addGastronomia("182835", 0.2, false, "gaseosa", 120, 3);
        sist.addHospedaje("758972", 0.15, false, "habitacion simple", 1000);
        
        System.out.println("lista: ");
        for(Servicio s : sist.getList_servicios()){
            System.out.println(s.toString());
        }
        
        System.out.println("4-1");
        ArrayList<Servicio> lista2 = sist.getServicio(true);
        for(Servicio s : lista2){
            System.out.println(s.toString());
        }
        
        System.out.println("4-2");
        ArrayList<Servicio> lista3 = sist.getServicio(true, LocalDate.of(2020, 10, 28));
        for(Servicio s : lista3){
            System.out.println(s.toString());
        }
    }
    
}
