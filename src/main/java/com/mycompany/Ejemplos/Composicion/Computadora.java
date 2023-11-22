/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejemplos.Composicion;

/**
 *
 * @author nenod
 */
public class Computadora {
                    public Computadora(){
                System.out.println("Encendiendo computadora");   
                Cpu cpu = new Cpu();
		Puerto puerto = new Puerto();
		Pantalla pantalla = new Pantalla();
		Centrocarga cc = new Centrocarga();
		Pila pila = new Pila();
		Gpu gpu = new Gpu();
		Teclado teclado = new Teclado();
		Mouse mouse = new Mouse();
		Altavoz altavoz = new Altavoz();
		Disco hdd = new Disco();
		cpu.procesar();
		puerto.detectar();
		pantalla.encender();
		cc.detectar();
		pila.cargar();
		gpu.renderizar();
		teclado.iluminar();
		mouse.encender();
		altavoz.encender();
		hdd.leer();
    }
public static void main(String[] args) {
Computadora Acer = new Computadora();    
    
}
}
