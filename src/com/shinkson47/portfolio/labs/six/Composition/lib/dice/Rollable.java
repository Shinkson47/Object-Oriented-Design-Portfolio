package com.shinkson47.portfolio.labs.six.composition.lib.dice;

/** This interface imposes two common 'rollable' 
 * behaviours on the objects of each class that
 * implements it.
 * 
 * @author la/lz
 */
public interface Rollable {

	public void roll();
	
	public int getScore();
	
}
