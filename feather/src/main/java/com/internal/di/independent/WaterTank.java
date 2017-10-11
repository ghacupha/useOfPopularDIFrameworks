/**
 * 
 */
package com.internal.di.independent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Singleton;

/**
 * @author Manuel Mauky
 *
 */
@Singleton
public class WaterTank implements WaterSupply {
	
	private final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public WaterTank() {
		super();
		log.log(Level.INFO,"new WaterTank()");
	}

	/**
	 * 
	 */
	public void getWater(){
        System.out.println("WaterTank:providing water");
    }
	
}
