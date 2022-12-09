/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo01alu03
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*HiloT primero = new HiloT("Primero Hilo");
        primero.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(),"Tercer Hilo").start();
        new Thread(new HiloR(),"Cuarto Hilo").start();*/
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();
        
    }
    
}
