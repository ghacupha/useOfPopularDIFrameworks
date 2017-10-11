/**
 * 
 */
package com.internal.di;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.internal.di.dependent.CoffeeMachine;
import com.internal.di.independent.DirectWaterSupply;
import com.internal.di.independent.WaterSupply;
/**
 * @author edwin.njeru
 *
 */
public class WaterSupplyModule extends AbstractModule {

	/**
	 * 
	 */
	@Override
	protected void configure() {

		bind(WaterSupply.class).to(DirectWaterSupply.class);
		
	}
	
}
