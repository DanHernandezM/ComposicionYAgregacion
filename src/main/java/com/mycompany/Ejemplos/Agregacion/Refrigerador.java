/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Ejemplos.Agregacion;

/**
 *
 * @author nenod
 */
public class Refrigerador {
public Refrigerador(){
 System.out.println("*Refrigerador salvaje aparecio*");   
}
public void revisar(){
    System.out.println("Quiero revisar el estado de mis alimentos!");
}

    public static void main(String[] args) {
        Refrigerador lg = new Refrigerador();
                Mango mango = new Mango();
		Berenjena berenjena = new Berenjena();
		Cebolla cebolla = new Cebolla();
		Calabaza calabaza = new Calabaza();
		Guayaba guayaba = new Guayaba();
		Piña piña = new Piña();
		Manzana manzana = new Manzana();
		Naranja naranja = new Naranja();
		Pera pera = new Pera();
		Sandia sandia = new Sandia();
		
                lg.revisar();
		
		mango.estado();
                berenjena.estado();
                cebolla.estado();
                calabaza.estado();
                guayaba.estado();
                piña.estado();
                manzana.estado();
                naranja.estado();
                pera.estado();
                sandia.estado();
                
    }
}
