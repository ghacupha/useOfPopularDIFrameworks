/**
 * 
 */
package com.internal.di.dependent;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.internal.di.independent.BeanContainer;
import com.internal.di.independent.Mill;

/**
 * @author Manuel Mauky
 *
 */
public class CoffeePowderProvider {
	
	private final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private final Mill mill;
	private final BeanContainer container;
	
	public CoffeePowderProvider(Mill mill, BeanContainer container) {
		super();
		
		log.log(Level.INFO,"new CoffeePowderProvider()");
		
		this.mill = mill;
		this.container = container;
	}
	
	public void getPowder() {
		System.out.println("CoffeePowderProvider: Start making coffee powder.");
		container.getBeans(10);
		mill.grind();
		System.out.println("CoffeePowderProvider: Here you have your coffee powder");
	}
	
}
