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
public class Pot {
    
    private int servings = 0;
    private int capacity;
    
    public Pot(int capacity) {
        this.capacity = capacity;
    }
    
    public synchronized void getserving() throws InterruptedException {
        
        while(servings == 0) {
            System.out.println(Thread.currentThread().getName() + " has to wait ");
            wait();
        }
 
        servings--;
        
        System.out.println(Thread.currentThread().getName() + " is served");
        // when necessary, wake up threads in Waiting Set in order to asure
        // a runnable cook
        if (servings == 0) notifyAll();
        print_servings();
    }
    
    public synchronized void fillpot() throws InterruptedException {
        //Condition synchronization: .....
        //....
        while (servings > 0) {
            System.out.println(Thread.currentThread().getName() + " has to wait");
            wait();
        }
        
        servings = capacity;
        System.out.println(Thread.currentThread().getName() + " fills the pot");
        print_servings();
        notifyAll();
    }
    
    public synchronized void print_servings() {
        System.out.println("servings in the pot: " + servings);
    }
}
