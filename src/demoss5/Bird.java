/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoss5;

/**
 *
 * @author daolinh
 */
public class Bird extends Animal implements CoTheBay, CoTheChay{

    @Override
    public void fly() {
        System.out.println("Mình thích thì mình fly.");
    }
    
    public void fly(int speed){
        System.out.println("Mình thích thì mình fly." + speed);
    }

    @Override
    public void speak() {
        System.out.println("Hót");
    }

    @Override
    public void run() {
        System.out.println("Run for your life!");
    }

    @Override
    public int runWithSpeed(int speed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
