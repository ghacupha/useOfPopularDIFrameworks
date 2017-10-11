/**
 * 
 */
package com.internal.di;

import org.codejargon.feather.Feather;

import com.internal.di.dependent.CoffeeMachine;
import com.internal.di.independent.DirectWaterSupply;
import com.internal.di.independent.WaterSupply;


/**
 * 
 * @author edwin.njeru
 *
 */
public class CoffeeApp {
	
	public static void main(String...args){
		
		Feather feather = Feather.with(new WaterSupplyModule());
		
		CoffeeMachine coffeeMachine = feather.instance(CoffeeMachine.class);
		
		coffeeMachine.makeCoffee();
    }
	
}
