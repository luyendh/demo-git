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
public abstract class Animal {

    private String name;
    private String color;

    public Animal() {  
        
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }                     
    
    public final void doSomething(){
        System.out.println("Do something!");
    }
    
    public abstract void speak();
}
