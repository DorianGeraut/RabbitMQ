/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import javax.ejb.EJB;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import ejb.ISensor;

/**
 *
 * @author boixel
 */
public class Main {

    @EJB
    private static ISensor s;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.err.println("result = " + mySession.getResult());
        
    		//Registry registry = LocateRegistry.getRegistry();
    		//ISensor s = (ISensor) registry.lookup("sensor");
    		Client c = new Client(s);

				//SensorListener stub = (SensorListener) UnicastRemoteObject.exportObject(c, 0);
				//s.addListener(c);
                
    		c.menu();
    }
    
}
