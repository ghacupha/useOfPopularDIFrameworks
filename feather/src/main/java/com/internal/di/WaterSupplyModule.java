/**
 * 
 */
package com.internal.di;

import javax.inject.Singleton;

import org.codejargon.feather.Provides;

import com.internal.di.independent.DirectWaterSupply;
import com.internal.di.independent.WaterSupply;

/**
 * @author edwin.njeru
 *
 */
public class WaterSupplyModule {
	
	@Provides
	@Singleton
	public WaterSupply provideWaterSupply() {
		
		return new DirectWaterSupply();
	}
	
}
