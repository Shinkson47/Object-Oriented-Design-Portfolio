package com.shinkson47.portfolio.labs.seven.Interfaces.main;

import com.shinkson47.portfolio.labs.seven.Interfaces.lib.polymorphism.Die;
import com.shinkson47.portfolio.labs.seven.Interfaces.lib.polymorphism.MultipleDice;
import com.shinkson47.portfolio.labs.seven.Interfaces.lib.polymorphism.PairOfDice;
import com.shinkson47.portfolio.labs.seven.Interfaces.lib.polymorphism.Rollable;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {

	public static void main(String[] args) {
		List<Rollable> dice = new ArrayList<>();

		dice.add(new Die());
		dice.add(new PairOfDice());
		dice.add(new MultipleDice(5));

		for (Rollable r : dice) {
			System.out.println(r.toString());
			
			r.roll();
			System.out.println("Score after roll? " + r.getScore() + "\n");	
		}

	}

}
