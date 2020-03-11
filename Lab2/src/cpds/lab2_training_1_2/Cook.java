/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpds.lab2_training_1_2;

import cpds.lab2_training_1_1.*;

/**
 *
 * @author mdomingu
 */
public class Cook extends Thread {
    BadPot pot;

    public Cook(BadPot pot) {
        this.pot = pot;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " would like to fill the pot");
            try {
                Thread.sleep(200);
                pot.fillpot();
            }
            catch(InterruptedException e) {};
        }
    }
}
