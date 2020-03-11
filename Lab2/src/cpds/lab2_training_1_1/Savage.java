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
public class Savage extends Thread {
    Pot pot;

    public Savage(Pot pot) {
        this.pot = pot;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is hungry");
            try {
                Thread.sleep(200);
                pot.getserving();
            }
            catch(InterruptedException e) {};
        }
    }
    
}
