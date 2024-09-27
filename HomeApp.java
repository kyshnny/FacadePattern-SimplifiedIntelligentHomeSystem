/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadepattern;

/**
 *
 * @author Shania Mae Ucag
 */
public class HomeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();
        
        homeInterface.turnOnAll();
        homeInterface.turnOffLight();
        homeInterface.turnOffAll();
    }
    
}
