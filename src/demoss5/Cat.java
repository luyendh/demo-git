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
public class Cat extends Animal{

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
        
    
    public Cat() {        
    }     

    public Cat(String breed, String name, String color) {
        super(name, color);       
        this.breed = breed;
    }             

    @Override
    public void speak() {
        System.out.println("Meow meow!");
    }
}
