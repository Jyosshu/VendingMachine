package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Change {
	
	private int quarters = 0;
	private int dimes = 0;
	private int nickels = 0;
	private int convChange = 0;
	private BigDecimal changeToReturn = null;
	
	
	List<Integer> custChange = new ArrayList<>();

	public List<Integer> getChange(BigDecimal change){
		changeToReturn = change;
		convChange = change.multiply(new BigDecimal("100")).intValueExact();
		
	while (convChange >= 25){

        quarters = quarters + 1;
        convChange = convChange - 25;
    }
    while (convChange >= 10){
        dimes = dimes + 1;
        convChange = convChange - 10;
    }
    while (convChange >= 5){
        nickels = nickels + 1;
        convChange = convChange - 5;
    }
//    System.out.printf("\nHere's your change:\n%d quarters, %d dimes, %d nickels and %d pennies!",
//        quarters, dimes, nickels, change);
    
    custChange.add(quarters);
    custChange.add(dimes);
    custChange.add(nickels);
    
    return custChange;
	}

	@Override
	public String toString() {
		return "Your change is $" + changeToReturn + ".  Quarters: " + quarters + ", dimes: " + dimes + ", nickels: " + nickels;
	}

	public int getQuarters() {
		return quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public int getNickels() {
		return nickels;
	}
}
