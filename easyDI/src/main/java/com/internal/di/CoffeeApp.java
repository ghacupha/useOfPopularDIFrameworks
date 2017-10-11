/**
 * 
 */
package com.internal.di;

import com.internal.di.dependent.CoffeeMachine;
import com.internal.di.independent.DirectWaterSupply;
import com.internal.di.independent.WaterSupply;

import eu.lestard.easydi.EasyDI;

/**
 * Comment from blog post : 
 * 
 * ...
 * unlike some other DI-frameworks we didn't have to do any changes to our business classes
 * ...
 * 
 * 
 * @author Manuel Mauky
 *
 */
public class CoffeeApp {
	
	public static void main(String...args){
		
		EasyDI easyDI = new EasyDI();
		//easyDI.markAsSingleton(WaterTank.class); using @Singleton
		easyDI.bindInterface(WaterSupply.class, DirectWaterSupply.class);
		
		CoffeeMachine coffeeMachine = easyDI.getInstance(CoffeeMachine.class);
		
		coffeeMachine.makeCoffee();
    }
	
}
