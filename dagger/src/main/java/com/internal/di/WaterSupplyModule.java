/**
 * 
 */
package com.internal.di;

import javax.inject.Singleton;

import com.internal.di.dependent.CoffeeMachine;
import com.internal.di.independent.DirectWaterSupply;
import com.internal.di.independent.WaterSupply;

import dagger.Module;
import dagger.Provides;

/**
 * @author edwin.njeru
 *
 */
@Module(
		injects = CoffeeApp.class
)
public class WaterSupplyModule {
	
	@Provides
	@Singleton
	public WaterSupply provideWaterSupply() {
		
		return new DirectWaterSupply();
	}
	
}
