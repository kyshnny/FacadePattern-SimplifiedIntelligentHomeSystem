/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepattern;

/**
 *
 * @author Shania Mae Ucag
 */
public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService airconditioning;
    
    public HomeInterface(){
        light = new Light();
        tv = new TV();
        airconditioning = new AirConditioning();
    }
    
    public void turnOnAll(){
        light.turnON();
        tv.turnON();
        airconditioning.turnON();
    }
    
    public void turnOffAll(){
        light.turnOFF();
        tv.turnOFF();
        airconditioning.turnOFF();
    }
    
    public void turnOnLight(){
        light.turnON();
    }
    
    public void turnOffLight(){
        light.turnOFF();
    }
    
    public void turnOnTV(){
        tv.turnON();
    }
    
    public void turnOffTV(){
        tv.turnOFF();
    }
    
    public void turnOnAirConditioning(){
        airconditioning.turnON();
    }
    
    public void turnOffAirConditioning(){
        airconditioning.turnOFF();
    }
    
}
