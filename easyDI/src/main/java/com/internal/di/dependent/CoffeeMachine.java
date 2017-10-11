/**
 * 
 */
package com.internal.di.dependent;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.internal.di.feature.MilkFrother;
import com.internal.di.independent.WaterSupply;

/**
 * @author Manuel Mauky
 *
 */
public class CoffeeMachine {
	
	private final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private final CoffeePowderProvider coffeePowderProvider;
    private final WaterSupply waterTank;
    private final MilkFrother frother;

    public CoffeeMachine(CoffeePowderProvider coffeePowderProvider, WaterSupply waterTank, MilkFrother frother) {
    	log.log(Level.INFO,"new CoffeeMachine()");
    	this.coffeePowderProvider = coffeePowderProvider;
		this.waterTank = waterTank;
		this.frother = frother;
	}

	public void makeCoffee(){
        System.out.println("CoffeeMachine: Start making coffee");
        waterTank.getWater();
        coffeePowderProvider.getPowder();
        System.out.println("CoffeeMachine: I have all ingredients. Let's go");
        System.out.println("CoffeeMachine: ...");
        System.out.println("CoffeeMachine: Coffee is finished");
    }
	
}
