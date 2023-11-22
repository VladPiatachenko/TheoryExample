/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.springexample;

/**
 *
 * @author Oksana
 */
public class Topping {
    String name;
    
    Topping(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name;
    }
}
