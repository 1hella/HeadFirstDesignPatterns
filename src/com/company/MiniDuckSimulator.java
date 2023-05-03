package com.company;

import com.company.duck.FlyRocketPowered;
import com.company.duck.MallardDuck;
import com.company.duck.Duck;
import com.company.duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
	    Duck mallard = new MallardDuck();
	    mallard.performQuack();
	    mallard.performFly();

	    Duck model = new ModelDuck();
	    model.performQuack();
	    model.performFly();
	    model.setFlyBehaviour(new FlyRocketPowered());
	    model.performFly();
    }
}
