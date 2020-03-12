/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpds.lab2_exercise_1;

/**
 *
 * @author mdomingu
 */
public class Savage extends Thread {
    PotNoWait pot;

    public Savage(PotNoWait pot) {
        this.pot = pot;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is hungry");
            try {
                pot.getserving();
                //This is going for a walk
                Thread.sleep(300);
            }
            catch(InterruptedException e) {};
        }
    }
    
}
