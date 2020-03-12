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
public class PotNoWait {
        private int servings = 0;        
        private int capacity;

        public PotNoWait(int capacity) {
            this.capacity = capacity;
        }
        
        public void getserving() throws InterruptedException {
            if (servings == 0) {
                System.out.println(Thread.currentThread().getName() + " go walk ");
            }
            else{
                Thread.sleep(200);
                servings--;
                System.out.println(Thread.currentThread().getName() + " is served");
                print_servings();        
            }
            
        }
        
        public void fillpot() throws InterruptedException {
            if (servings > 0) {
                System.out.println(Thread.currentThread().getName() + " go walk");
            }
            else{
                Thread.sleep(200);
                servings = capacity;
                System.out.println(Thread.currentThread().getName() + " fills the pot");
                print_servings();
            }
        }
        
        public synchronized void print_servings() {
            System.out.println("servings in the pot: " + servings);
        }
        
}
