/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepattern;

/**
 *
 * @author Shania Mae Ucag
 */
public class TV implements HomeService {
    
    @Override
    public void turnON(){
        System.out.println("The TV is turned ON.");
    }
    
    @Override
    public void turnOFF(){
        System.out.println("The TV is turned OFF.");
    }
    
}
