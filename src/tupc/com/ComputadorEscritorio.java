/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupc.com;

/**
 *
 * @author kebinr
 */
public class ComputadorEscritorio {
    int serial;
    String marca, modelo;
    String[] procesador = new String[3];
    String[] disco_duro= new String[3];
    float ram;
    public ComputadorEscritorio(){
        serial= 13233;
        marca= "hp";
        modelo= "Acxza12";
        procesador[0]="exynos";
        procesador[1]="4tsa";
        procesador[2]="1.5ghz";
        disco_duro[0]="samsung";
        disco_duro[1]="xcv";
        disco_duro[2]="2.3ghz";
        ram=32;
    }
    
}



  
