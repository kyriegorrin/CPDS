/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpds.lab2_training_1_3;

import cpds.lab2_training_1_2.*;

/**
 *
 * @author mdomingu
 */
public class BadBanketTwo {
    public static void main(String args[]) throws InterruptedException{
    BadPotTwo pot = new BadPotTwo(5);
    Thread s1 = new Savage(pot); s1.setName("alice");
    Thread s2 = new Savage(pot); s2.setName("bob");
    Thread s3= new Savage(pot); s3.setName("peter");
    Thread s4= new Savage(pot); s4.setName("xana");
    Thread s5 = new Savage(pot); s5.setName("tom");
    Thread s6 = new Savage(pot); s6.setName("jerry");
    Thread s7= new Savage(pot); s7.setName("kim");
    Thread s8= new Savage(pot); s8.setName("berta");
    Thread c = new Cook(pot); c.setName("cook");
    s1.start(); s2.start(); s3.start(); s4.start();
    s5.start(); s6.start(); s7.start(); s8.start();
    c.start();
    }
}