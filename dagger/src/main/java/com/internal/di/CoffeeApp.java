/**
 * 
 */
package com.internal.di;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.internal.di.dependent.CoffeeMachine;
import com.internal.di.independent.DirectWaterSupply;
import com.internal.di.independent.WaterSupply;

import dagger.ObjectGraph;


/**
 * 
 * Also didn't work, just like its Dagger2 offspring. Clearly code-generation is not my thing
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
		
		ObjectGraph objectGraph = ObjectGraph.create(new WaterSupplyModule());
		
		CoffeeApp coffeeApp = objectGraph.get(CoffeeApp.class);
		
		coffeeApp.run();
    }
	
}
