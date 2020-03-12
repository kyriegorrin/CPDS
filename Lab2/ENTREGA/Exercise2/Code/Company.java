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
public class Company extends Thread{
    Account account;
    
    public Company(Account account){
        this.account = account;
    }
    
    public void run(){
        while(true){
            try{
                //Always do a fixed deposit, a paycheck or whatever, they don't get paid much anyways :(
                account.deposit(5);
                //Add a cooldown to be less frequent than person operations
                Thread.sleep(4000);
            }        
            catch(InterruptedException e){};
        }
    }
}
