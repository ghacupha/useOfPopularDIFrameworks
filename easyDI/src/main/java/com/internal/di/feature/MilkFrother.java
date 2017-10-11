/**
 * 
 */
package com.internal.di.feature;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.internal.di.independent.WaterSupply;

/**
 *  @author Manuel Mauky
 *
 */
public class MilkFrother {
	
	private final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private final WaterSupply waterTank;

	public MilkFrother(WaterSupply waterTank) {
		this.waterTank = waterTank;
		
		log.log(Level.INFO, "new MilkFrother()");
	}
	
	 public void makeMilkFroth(){
	        waterTank.getWater();
	        // heat the water up to get steam
	        System.out.println("MilkFrother: making milk froth");
	    }
}
