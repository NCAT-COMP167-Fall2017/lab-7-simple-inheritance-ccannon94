/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CCannon
 */
public class SimpleInheritance {
    private static Scanner reader;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Dwelling> dwellings = new ArrayList<>();
        
        try {
            reader = new Scanner(new File(args[0]));
            
            char dwellingType = reader.nextLine().charAt(0);
            
            switch(dwellingType) {
                case 'H':
                    dwellings.add(readApartment());
                    break;
                case 'A':
                    dwellings.add(readHouse());
                    break;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleInheritance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Apartment readApartment() {
        Apartment apartment = new Apartment();
        
        apartment.setStreetAddress(reader.nextLine());
        apartment.setCity(reader.nextLine());
        apartment.setState(reader.nextLine());
        apartment.setZip(reader.nextLine());
        apartment.setBedrooms(Integer.parseInt(reader.nextLine().trim()));
        apartment.setBathrooms(Double.parseDouble(reader.nextLine().trim()));
        apartment.setAptNum(reader.nextLine());
        int laundryInt = Integer.parseInt(reader.nextLine().trim());
        
        switch(laundryInt) {
            case 0:
                apartment.setLaundry(false);
                break;
            case 1:
                apartment.setLaundry(true);
                break;
        }
        
        JOptionPane.showMessageDialog(null, apartment.toString(), "New Apartment", JOptionPane.PLAIN_MESSAGE);
        
        return apartment;
    }
    
    public static House readHouse() {
        House house = new House();
        
        house.setStreetAddress(reader.nextLine());
        house.setCity(reader.nextLine());
        house.setState(reader.nextLine());
        house.setZip(reader.nextLine());
        house.setBedrooms(Integer.parseInt(reader.nextLine().trim()));
        house.setBathrooms(Double.parseDouble(reader.nextLine().trim()));
        house.setAcreage(Double.parseDouble(reader.nextLine().trim()));
        house.setGarageSize(Integer.parseInt(reader.nextLine().trim()));
        
        JOptionPane.showMessageDialog(null, house.toString(), "New House", JOptionPane.PLAIN_MESSAGE);
        
        return house;
    }
    
}
