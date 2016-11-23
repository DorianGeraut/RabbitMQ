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

import java.util.Scanner;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client implements SensorListener {
    ISensor sense;
    Scanner c=new Scanner(System.in);
    public Client(ISensor sensor) {
        sense=sensor;
    }

    public void statusChanged() {
        System.out.println("Status changed.");
    }
    
    public void menu() {
        String rep="";
        while (!"q".equals(rep)) {
            try {
                rep= c.nextLine();
                switch (rep) {
                    case "o": {
                        sense.onOff();
                        break;
                    }
                    case "s": {
                        System.out.println("status :"+sense.getStatus());
                        break;
                    }
                    case "v": {
                        System.out.println("value :"+sense.getValue());
                        break;
                    }
                    default : System.out.println("q: quitter - o: switch - s: status - v: value");
                }
            } catch (SensorNotActivated ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
