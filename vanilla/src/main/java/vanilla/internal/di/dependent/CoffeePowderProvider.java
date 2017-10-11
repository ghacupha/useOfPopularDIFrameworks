/**
 * 
 */
package vanilla.internal.di.dependent;

import vanilla.internal.di.independent.BeanContainer;
import vanilla.internal.di.independent.Mill;

/**
 * @author Manuel Mauky
 *
 */
public class CoffeePowderProvider {
	
	private final Mill mill;
	private final BeanContainer container;
	
	public CoffeePowderProvider(Mill mill, BeanContainer container) {
		super();
		this.mill = mill;
		this.container = container;
	}
	
	public void getPowder() {
		System.out.println("CoffeePowderProvider: Start making coffee powder.");
		container.getBeans(10);
		mill.grind();
		System.out.println("CoffeePowderProvider: Here you have your coffee powder");
	}
	
}
