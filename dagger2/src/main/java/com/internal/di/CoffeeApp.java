/**
 * 
 */
package com.internal.di;

import javax.inject.Singleton;

import com.internal.di.dependent.CoffeeMachine;
import com.internal.di.independent.DirectWaterSupply;
import com.internal.di.independent.WaterSupply;

import dagger.Component;


/**
 * This one is not working at all. Too much convention?
 * 
 * Will need to find out how to get the entry point for this Dagger2 thing
 * 
 * @author edwin.njeru
 *
 */
public class CoffeeApp {
	
	public static void main(String...args){
		
		AppComponent component = DaggerAppComponent.create();
		
		CoffeeMachine coffeeMachine = component.getCoffeeMachine();
		
		coffeeMachine.makeCoffee();
    }
	
}
