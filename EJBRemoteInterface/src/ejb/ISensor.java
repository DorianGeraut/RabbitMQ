/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

/**
 *
 * @author boixel
 */

public interface ISensor {

    public double getValue() throws SensorNotActivated;
    public void onOff();
    public boolean getStatus();
    public void notifyListeners();
    public void removeListener(SensorListener s);
    public void addListener(SensorListener s);
    
}
