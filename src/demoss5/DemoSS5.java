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
public class DemoSS5 {
    
    private final double PI = 3.14;
    private final String NAME_OF_THAY = "Hung";

    public static void main(String[] args) {
//        Cat xecuaem = new Cat("1", "2", "3");
//        
//        System.out.println(xecuaem.getName());
//        System.out.println(xecuaem.getColor());
//        System.out.println(xecuaem.getBreed());
//        xecuaem.speak();
//        xecuaem.doSomething();      
        Bird a = new Bird();
        a.doSomething();
        a.speak();
        a.fly();
        a.run();
    }
}
