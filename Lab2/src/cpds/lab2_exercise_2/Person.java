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
public class Person extends Thread{
    Account account;
    
    public Person(Account account){
        this.account = account;
    }
    
    public void run(){
        while(true){
            try{
                //We do a deposit or a withdraw randomly, pseudo-random values
                boolean diposit = Math.random() < 0.5;                
                int amount = (int)(Math.random()*10/3) + 1; //+1 to avoid 0 dollars
                
                if(diposit)
                    account.deposit(amount);
                else
                    account.withdraw(amount);
                
                //The person goes mind its own business for a while
                Thread.sleep(200);
            }        
            catch(InterruptedException e){};
        }
    }
}
