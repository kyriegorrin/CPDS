/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpds.lab2_training_1_3;

import cpds.lab2_training_1_2.*;
import cpds.lab2_training_1_1.*;

/**
 *
 * @author mdomingu
 */
public class Cook extends Thread {
    BadPotTwo pot;

    public Cook(BadPotTwo pot) {
        this.pot = pot;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " would like to fill the pot");
            try {
                pot.fillpot();
            }
            catch(InterruptedException e) {};
        }
    }
}
