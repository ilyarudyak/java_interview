package head_first.decorator.starbuzz;

import head_first.decorator.starbuzz.blends.DarkRoast;
import head_first.decorator.starbuzz.blends.Espresso;
import head_first.decorator.starbuzz.blends.HouseBlend;
import head_first.decorator.starbuzz.decorators.Mocha;
import head_first.decorator.starbuzz.decorators.Soy;
import head_first.decorator.starbuzz.decorators.Whip;

/**
 * Created by ilyarudyak on 6/29/16.
 */
public class StarbuzzCoffeeDemo {

    public static void main(String args[]) {

        System.out.println("just Espresso");
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        System.out.println();
        System.out.println("DarkRoast with double Mocha and Whip");
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);

        System.out.println();
        System.out.println("HouseBlend with Soy, Moscha, Whip");
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}


























