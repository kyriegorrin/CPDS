/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpds.lab2_exercise_2;


/**
 *
 * @author rzarco
 */

public class Banking {
    public static void main(String args[]) throws InterruptedException{
        //We start with 10 dollars
        Account account = new Account(10);
        Thread s1 = new Person(account); s1.setName("Alice");
        Thread s2 = new Person(account); s2.setName("Bob");
        Thread c = new Company(account); c.setName("BSC");
        
        s1.start(); 
        s2.start(); 
        c.start();
    }
}
