/**
 * 
 */
package com.internal.di;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.internal.di.dependent.CoffeeMachine;

/**
 * Much easier than Dagger. 
 * 
 * @author edwin.njeru
 *
 */
public class CoffeeApp implements Runnable {
	
	@Inject CoffeeMachine coffeeMachine;
	
	
	/**
	 * 
	 */
	public void run() {

		coffeeMachine.makeCoffee();
	}

	public static void main(String...args){
		
		Injector injector = 
				Guice.createInjector(new WaterSupplyModule());
		
		CoffeeApp coffeeApp = injector.getInstance(CoffeeApp.class);
		
		coffeeApp.run();
    }
	
}
