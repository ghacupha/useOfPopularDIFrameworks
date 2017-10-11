/**
 * 
 */
package com.internal.di.independent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

/**
 * @author Manuel Mauky
 *
 */
public class BeanContainer {
	
	private final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private int initialAmount;
	
	public BeanContainer(int initialAmount) {
		this.initialAmount = initialAmount;
	}

	@Inject
	public BeanContainer() {
		super();
		
		log.log(Level.INFO,"new BeanContainer()");
	}
	
	

	public void getBeans(int amount){
        System.out.println("BeanContainer: here you have " + amount + " beans");
    }
}
