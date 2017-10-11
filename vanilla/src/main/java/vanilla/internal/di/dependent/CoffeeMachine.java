/**
 * 
 */
package vanilla.internal.di.dependent;

import vanilla.internal.di.independent.WaterTank;

/**
 * @author Manuel Mauky
 *
 */
public class CoffeeMachine {
	
	private final CoffeePowderProvider coffeePowderProvider;
    private final WaterTank waterTank;

    public CoffeeMachine(CoffeePowderProvider coffeePowderProvider, WaterTank waterTank ){
        this.coffeePowderProvider = coffeePowderProvider;
        this.waterTank = waterTank;
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
