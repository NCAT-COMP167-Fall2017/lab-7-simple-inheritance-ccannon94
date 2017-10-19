/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinheritance;

/**
 *
 * @author CCannon
 */
public class House extends Dwelling {
    private double acreage;
    private int garageSize;

    /**
     * @return the acreage
     */
    public double getAcreage() {
        return acreage;
    }

    /**
     * @param acreage the acreage to set
     */
    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    /**
     * @return the garageSize
     */
    public int getGarageSize() {
        return garageSize;
    }

    /**
     * @param garageSize the garageSize to set
     */
    public void setGarageSize(int garageSize) {
        this.garageSize = garageSize;
    }
}
