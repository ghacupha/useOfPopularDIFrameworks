/**
 * 
 */
package com.internal.di.independent;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Borrowed from
 * 
 * @author Manuel Mauky
 * 
 * modified by @author edwin.njeru
 *
 */
public class Mill {
	
	private final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public Mill() {
		super();
		log.log(Level.INFO,"new Mill()");
	}

	public void grind(){
        System.out.println("Mill: Let's start grinding");
    }
	
}
