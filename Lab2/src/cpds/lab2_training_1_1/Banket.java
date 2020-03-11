/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpds.lab2_training_1_1;

/**
 *
 * @author mdomingu
 */
public class Banket {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pot pot = new Pot(5);
        Thread a = new Savage(pot);
        a.setName("alice");
        Thread b = new Savage(pot);
        b.setName("bob");
        Thread c = new Cook(pot);
        c.setName("cook");
        a.start();
        b.start();
        c.start();
    }
}
