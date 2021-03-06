package com.shinkson47.portfolio.labs.seven.Interfaces.lib.measurable;

import java.util.ArrayList;
import java.util.List;


public class DataAnalysis<E extends Measurable> {

	private List<E> objects;

	public DataAnalysis() {
		objects = new ArrayList<>();
	}

	public void addMeasurable(E m) {
		objects.add(m);
	}

	public int sum() {
		return objects.stream().mapToInt(Measurable::getMeasure).sum();
	}
	
	public String toString() {
		return "DataAnalysis[objects= " + objects + "]";
	}
}
