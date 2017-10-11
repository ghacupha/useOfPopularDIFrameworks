/**
 * 
 */
package vanilla.internal.di;

import vanilla.internal.di.dependent.CoffeeMachine;
import vanilla.internal.di.dependent.CoffeePowderProvider;
import vanilla.internal.di.independent.BeanContainer;
import vanilla.internal.di.independent.Mill;
import vanilla.internal.di.independent.WaterTank;

/**
 * @author Manuel Mauky
 *
 */
public class CoffeeApp {
	
	public static void main(String...args){
        Mill mill = new Mill();
        WaterTank waterTank = new WaterTank();
        BeanContainer beanContainer = new BeanContainer();
        CoffeePowderProvider powderProvider = new CoffeePowderProvider(mill,beanContainer);
        CoffeeMachine coffeeMachine = new CoffeeMachine(powderProvider,waterTank);

        coffeeMachine.makeCoffee();
    }
	
}
