/**
 * 
 */
package com.internal.di.independent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Singleton;

/**
 * @author edwin.njeru
 *
 */
@Singleton
public class DirectWaterSupply implements WaterSupply {
	
	private final Logger log = Logger.getGlobal();

	public DirectWaterSupply() {
		
		log.log(Level.INFO, "new DirectWaterSupply()");
	}

	/**
	 * 
	 */
	public void getWater() {

		System.out.println("DirectWaterSupply: get water from the water tap");
	}
	
	
}
