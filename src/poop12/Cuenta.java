/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu03
 */
public class Cuenta extends Thread {
    private static double saldo;

    public Cuenta(String name) {
        super(name);
        saldo =0;
    }

    public static double consultaSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Cuenta.saldo = saldo;
    }
    public synchronized void depositarDinero(double monto){
        saldo+=monto;
        System.out.println("Depositando... Saldo: $"+saldo);
        notifyAll();
    }
    public synchronized void retirarDinero(double monto){
        if(monto>saldo){
            System.out.println(getName()+" debe esperar un deposito Saldo "+saldo);
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            notifyAll();
        }
        else{
            saldo-=monto;
            System.out.println(getName()+ " extrajo la cantidad "+monto+" Saldo Actual: $"+saldo);
            
        }
        
    }
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            if(getName().equals("Deposito 1")||getName().equals("Deposisto 2")){
                this.depositarDinero(200);
            }
            else{
                this.retirarDinero(50);
            }
        }
        
    }
    
}
