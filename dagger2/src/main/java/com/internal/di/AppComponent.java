/**
 * 
 */
package com.internal.di;

import com.internal.di.dependent.CoffeeMachine;

import dagger.Component;

/**
 * @author edwin.njeru
 *
 */
@Component
public interface AppComponent {
	
	CoffeeMachine getCoffeeMachine();
	
}
