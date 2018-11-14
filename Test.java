/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpatientmanagementlist;

/**
 *
 * @author Fabi
 */
public class Test {
 
    public static void main(String[] args){
        Patient p1 = new Patient(); 
        Patient p2 = new Patient();
        Patient p3 = new Patient();
        
        System.out.println("p1: " + p1.getPidNumber());
        System.out.println("p2: " + p2.getPidNumber());
        System.out.println("p3: " + p3.getPidNumber());
                
    }
}
