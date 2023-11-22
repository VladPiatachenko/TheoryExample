/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.springexample;

/**
 *
 * @author Oksana
 */
public class Soda {
    String name;
    int size;
    Promotion prom;
    Topping sweat;

    public Topping getSweat() {
        return sweat;
    }

    public void setSweat(Topping sweat) {
        this.sweat = sweat;
    }
    
    public Promotion getProm() {
        return prom;
    }

    public void setProm(Promotion prom) {
        this.prom = prom;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void info(){
        System.out.println("It's "+name+" with "+sweat.toString()+" in "+size+"ml glass!\n"+prom);
        
    }
}
