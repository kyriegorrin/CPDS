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

//We assume the approach of "do not wait and go do something else meanwhile"
public class Account {
    private int funds;
    
    public Account(int initialFunds){
        this.funds = initialFunds;
    }
    
    public synchronized void deposit(int amount) throws InterruptedException{
        //Sleep to be consistent with the training codes
        Thread.sleep(200);
        funds += amount;
        System.out.println(Thread.currentThread().getName() + " deposits " + amount + " dollars");
        print_funds();
    }
    
    public synchronized void withdraw(int amount) throws InterruptedException{
        if((funds - amount) < 0){
            System.out.println(Thread.currentThread().getName() + " can't withdraw " + amount + " dollars");
        }
        else{
            //Sleep just to be consistent with the other codes
            Thread.sleep(200);
            funds -= amount;
            System.out.println(Thread.currentThread().getName() + " withdraws " + amount + " dollars");
            print_funds();
        }
    }
    
    public synchronized void print_funds() {
            System.out.println("Available funds in the account: " + funds);
    }
}
