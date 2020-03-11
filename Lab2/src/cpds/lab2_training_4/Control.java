/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpds.lab2_training_4;

/**
 *
 * @author kyrie
 */
public class Control {
    int count = 0;
    boolean opened = false;
    
    public synchronized void arrive() throws InterruptedException {
        while (!opened){
            System.out.println(Thread.currentThread().getName() + " finds museum closed and waits ");
            wait();
        }
        
        count++;
        System.out.println(Thread.currentThread().getName() + " enters museum ");
        System.out.println("There are" + count + "people in the museum");
    }
    
    public synchronized void leave() throws InterruptedException {
        while (count <= 0){
            //TODO
        }
        
        if(count == 0){
            //TODO
        }
    }
    
    public synchronized void open() throws InterruptedException {
        System.out.println("The museum is opened");
        this.opened = true;
    }
    
    public synchronized void close() throws InterruptedException {
        System.out.println("The museum is closed");
        this.opened = false;
    }
}
